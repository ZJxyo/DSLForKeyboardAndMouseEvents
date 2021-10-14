package ast;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.*;

public class Keys extends Node{
    private  List<List<Integer>> keys;

    public static Map<String, List<Integer>> keyMap = new HashMap<String, List<Integer>>() {{
        // Uppercase and Lowercase letters
        put("A", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_A)));
        put("B", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_B)));
        put("C", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_C)));
        put("D", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_D)));
        put("E", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_E)));
        put("F", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_F)));
        put("G", new ArrayList<>(Arrays.asList(16, 71)));
        put("H", new ArrayList<>(Arrays.asList(16, 72)));
        put("I", new ArrayList<>(Arrays.asList(16, 73)));
        put("J", new ArrayList<>(Arrays.asList(16, 74)));
        put("K", new ArrayList<>(Arrays.asList(16, 75)));
        put("L", new ArrayList<>(Arrays.asList(16, 76)));
        put("M", new ArrayList<>(Arrays.asList(16, 77)));
        put("N", new ArrayList<>(Arrays.asList(16, 78)));
        put("O", new ArrayList<>(Arrays.asList(16, 79)));
        put("P", new ArrayList<>(Arrays.asList(16, 80)));
        put("Q", new ArrayList<>(Arrays.asList(16, 81)));
        put("R", new ArrayList<>(Arrays.asList(16, 82)));
        put("S", new ArrayList<>(Arrays.asList(16, 83)));
        put("T", new ArrayList<>(Arrays.asList(16, 84)));
        put("U", new ArrayList<>(Arrays.asList(16, 85)));
        put("V", new ArrayList<>(Arrays.asList(16, 86)));
        put("W", new ArrayList<>(Arrays.asList(16, 87)));
        put("X", new ArrayList<>(Arrays.asList(16, 88)));
        put("Y", new ArrayList<>(Arrays.asList(16, 88)));
        put("Z", new ArrayList<>(Arrays.asList(16, 90)));

        put("a", new ArrayList<>(Arrays.asList(65)));
        put("b", new ArrayList<>(Arrays.asList(66)));
        put("c", new ArrayList<>(Arrays.asList(67)));
        put("d", new ArrayList<>(Arrays.asList(68)));
        put("e", new ArrayList<>(Arrays.asList(69)));
        put("f", new ArrayList<>(Arrays.asList(70)));
        put("g", new ArrayList<>(Arrays.asList(71)));
        put("h", new ArrayList<>(Arrays.asList(72)));
        put("i", new ArrayList<>(Arrays.asList(73)));
        put("j", new ArrayList<>(Arrays.asList(74)));
        put("k", new ArrayList<>(Arrays.asList(75)));
        put("l", new ArrayList<>(Arrays.asList(76)));
        put("m", new ArrayList<>(Arrays.asList(77)));
        put("n", new ArrayList<>(Arrays.asList(78)));
        put("o", new ArrayList<>(Arrays.asList(79)));
        put("p", new ArrayList<>(Arrays.asList(80)));
        put("q", new ArrayList<>(Arrays.asList(81)));
        put("r", new ArrayList<>(Arrays.asList(82)));
        put("s", new ArrayList<>(Arrays.asList(83)));
        put("t", new ArrayList<>(Arrays.asList(84)));
        put("u", new ArrayList<>(Arrays.asList(85)));
        put("v", new ArrayList<>(Arrays.asList(86)));
        put("w", new ArrayList<>(Arrays.asList(87)));
        put("x", new ArrayList<>(Arrays.asList(88)));
        put("y", new ArrayList<>(Arrays.asList(89)));
        put("z", new ArrayList<>(Arrays.asList(90)));

        // Numbers and Number Symbols
        put("0", new ArrayList<>(Arrays.asList(48)));
        put("1", new ArrayList<>(Arrays.asList(49)));
        put("2", new ArrayList<>(Arrays.asList(50)));
        put("3", new ArrayList<>(Arrays.asList(51)));
        put("4", new ArrayList<>(Arrays.asList(52)));
        put("5", new ArrayList<>(Arrays.asList(53)));
        put("6", new ArrayList<>(Arrays.asList(54)));
        put("7", new ArrayList<>(Arrays.asList(55)));
        put("8", new ArrayList<>(Arrays.asList(56)));
        put("9", new ArrayList<>(Arrays.asList(57)));

        put(")", new ArrayList<>(Arrays.asList(16, 48)));
        put("!", new ArrayList<>(Arrays.asList(16, 49)));
        put("@", new ArrayList<>(Arrays.asList(16, 50)));
        put("#", new ArrayList<>(Arrays.asList(16, 51)));
        put("$", new ArrayList<>(Arrays.asList(16, 52)));
        put("%", new ArrayList<>(Arrays.asList(16, 53)));
        put("^", new ArrayList<>(Arrays.asList(16, 54)));
        put("&", new ArrayList<>(Arrays.asList(16, 55)));
        put("*", new ArrayList<>(Arrays.asList(16, 56)));
        put("(", new ArrayList<>(Arrays.asList(16, 57)));

        // Keys with two outputs
        put("`", new ArrayList<>(Arrays.asList(192)));
        put("-", new ArrayList<>(Arrays.asList(KeyEvent.VK_MINUS)));
        put("=", new ArrayList<>(Arrays.asList(KeyEvent.VK_EQUALS)));
        put("~", new ArrayList<>(Arrays.asList(16, 192)));
        put("_", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_MINUS)));
        put("+", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_EQUALS)));

        put("[", new ArrayList<>(Arrays.asList(KeyEvent.VK_OPEN_BRACKET)));
        put("]", new ArrayList<>(Arrays.asList(KeyEvent.VK_CLOSE_BRACKET)));
        put("\\", new ArrayList<>(Arrays.asList(KeyEvent.VK_BACK_SLASH)));
        put("{", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET)));
        put("}", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET)));
        put("|", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH)));

        put(";", new ArrayList<>(Arrays.asList(KeyEvent.VK_SEMICOLON)));
        put("'", new ArrayList<>(Arrays.asList(222)));
        put(":", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_SEMICOLON)));
        put("\"", new ArrayList<>(Arrays.asList(16, 222)));

        put(",", new ArrayList<>(Arrays.asList(KeyEvent.VK_COMMA)));
        put(".", new ArrayList<>(Arrays.asList(KeyEvent.VK_PERIOD)));
        put("/", new ArrayList<>(Arrays.asList(KeyEvent.VK_SLASH)));
        put("<", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_COMMA)));
        put(">", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_PERIOD)));
        put("?", new ArrayList<>(Arrays.asList(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH)));

        // fn Keys
        put("F1", new ArrayList<>(Arrays.asList(112)));
        put("F2", new ArrayList<>(Arrays.asList(113)));
        put("F3", new ArrayList<>(Arrays.asList(114)));
        put("F4", new ArrayList<>(Arrays.asList(115)));
        put("F5", new ArrayList<>(Arrays.asList(116)));
        put("F6", new ArrayList<>(Arrays.asList(117)));
        put("F7", new ArrayList<>(Arrays.asList(118)));
        put("F8", new ArrayList<>(Arrays.asList(119)));
        put("F9", new ArrayList<>(Arrays.asList(120)));
        put("F10", new ArrayList<>(Arrays.asList(121)));
        put("F11", new ArrayList<>(Arrays.asList(122)));
        put("F12", new ArrayList<>(Arrays.asList(123)));

        // command Keys (shift, tab, etc)
        put("alt", new ArrayList<>(Arrays.asList(KeyEvent.VK_ALT)));
        put("esc", new ArrayList<>(Arrays.asList(27)));
        put("backspace", new ArrayList<>(Arrays.asList(8)));
        put("tab", new ArrayList<>(Arrays.asList(9)));
        put("capslock", new ArrayList<>(Arrays.asList(20)));
        put("enter", new ArrayList<>(Arrays.asList(KeyEvent.VK_ENTER)));
        put("shift", new ArrayList<>(Arrays.asList(16)));
        put("control", new ArrayList<>(Arrays.asList(17)));
        put("ctrl", new ArrayList<>(Arrays.asList(17)));
        put("option", new ArrayList<>(Arrays.asList(18)));
        put("command", new ArrayList<>(Arrays.asList(KeyEvent.VK_META)));
        put("cmd", new ArrayList<>(Arrays.asList(KeyEvent.VK_META)));
        put("ArrowUp", new ArrayList<>(Arrays.asList(38)));
        put("ArrowDown", new ArrayList<>(Arrays.asList(40)));
        put("ArrowLeft", new ArrayList<>(Arrays.asList(37)));
        put("ArrowRight", new ArrayList<>(Arrays.asList(39)));
        put(" ", new ArrayList<>(Arrays.asList(32)));
        put("windows", new ArrayList<>(Arrays.asList(KeyEvent.VK_WINDOWS)));
        put("win", new ArrayList<>(Arrays.asList(KeyEvent.VK_WINDOWS)));
        put("left", new ArrayList<>(Arrays.asList(InputEvent.BUTTON1_DOWN_MASK)));
        put("middle", new ArrayList<>(Arrays.asList(InputEvent.BUTTON2_DOWN_MASK)));
        put("right", new ArrayList<>(Arrays.asList(InputEvent.BUTTON3_DOWN_MASK)));
        put("delete", new ArrayList<>(Arrays.asList(KeyEvent.VK_DELETE)));
        put("SpaceBar", new ArrayList<>(Arrays.asList(32)));
    }};

    public Keys(List<List<Integer>> keys) {
        this.keys = keys;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public List<List<Integer>> getKeys() {
        return keys;
    }

    public void setKeys(List<List<Integer>> keys) {
        this.keys = keys;
    }
}
