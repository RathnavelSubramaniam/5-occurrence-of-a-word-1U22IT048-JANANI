import java.util.HashMap;
import java.util.Map;
public class LetterCounter {
public static void main(String[] args) {
String input = &quot;HELLO THERE&quot;;
countLetters(input);
}
public static void countLetters(String input) {
Map&lt;Character, Integer&gt; letterCount = new HashMap&lt;&gt;();

// Convert the input string to uppercase to ensure case insensitivity
input = input.toUpperCase();

// Iterate through each character in the input string
for (char ch : input.toCharArray()) {
// Check if the character is a letter
if (Character.isLetter(ch)) {
// Increment the count for this letter in the map
letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
}
}

// Display the results
for (Map.Entry&lt;Character, Integer&gt; entry : letterCount.entrySet()) {
System.out.println(entry.getKey() + &quot;: &quot; + entry.getValue());
}
}}