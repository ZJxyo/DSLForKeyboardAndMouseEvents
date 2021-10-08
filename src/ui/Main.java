package ui;

import ast.Program;
import ast.firstEvaluator;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.ParseTreeToAST;
import parser.firstLexer;
import parser.firstParser;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import java.awt.Robot;


public class Main {

    public static void main(String[] args) throws IOException, MismatchedTokenException, AWTException {
        firstLexer lexer = new firstLexer(CharStreams.fromFileName("input"));
        for (Token token : lexer.getAllTokens()) {
            System.out.println(token);
        }
        lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("Done tokenizing");

        firstParser parser = new firstParser(tokens);
        ParseTreeToAST visitor = new ParseTreeToAST();
        Program parsedProgram = visitor.visitProgram(parser.program());
        System.out.println("Done parsing");

        Robot robot = new Robot();
        firstEvaluator firstEvaluator = new firstEvaluator(robot);
        parsedProgram.accept(firstEvaluator);

    }
}
