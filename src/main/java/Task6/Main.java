package Task6;

/*6 Есть входной файл с набором слов, написанных через пробел
Необходимо: Прочитать слова из файла.
Отсортировать в алфавитном порядке.
Посчитать сколько раз каждое слово встречается в файле.Вывести статистику на консоль
Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
*/
/**
 * @author Jenny Smirnova
 */
import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\Java 2.0\\src\\main\\java\\Task6\\input.txt"));
        String str;
        String [ ] words = new String[0];

        while((str = reader.readLine()) != null ){
            words = str.trim ( ).split ( "[\\s]+" );
        }

        Arrays.sort(words);
        System.out.println("Сортировка в алфавитном порядке: " + Arrays.toString(words));

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
           System.out.println("Количество повторений слова '" + word + "': " + wordToCount.get(word));
        }

        HashMap<String, Integer> t = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (t.containsKey(words[i])) {
                t.replace(words[i], t.get(words[i]) + 1);
            } else {
                t.put(words[i], 1);
            }
        }
        String wordPopular = null;
        int count = 0;
        for (String w : t.keySet()) {
            if (count < t.get(w)) {
                count = t.get(w);
                wordPopular = w;
            }
        }
        System.out.println("Слово с максимальным количеством повторений: '" + wordPopular + "' (" + count + " раз(а))");
    }
}

