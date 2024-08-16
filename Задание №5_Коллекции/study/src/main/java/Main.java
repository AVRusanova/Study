import java.io.*;
import java.util.*;

/**
 * @author ARusanova
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String file = "C:/Users/ARusanova/Documents/Слова.txt";
        // чтение строки из файла
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        reader.close();

        // разделение строки на слова
        String[] wordsArray = line.split(" ");
        System.out.println("Исходный массив слов: \n" + Arrays.toString(wordsArray));

        // сортировка слов по алфавиту
        Arrays.sort(wordsArray);
        System.out.println("Сортировка по алфавиту: \n" + Arrays.toString(wordsArray));

        // подсчет количества слов в массиве - вариант 1 (с сетом)

        // создание сета с набором слов без повторений
        Set<String> wordsSet = new HashSet<String>();
        Collections.addAll(wordsSet, wordsArray);

        // подсчет количества слов из сета в массиве, сохранение в мэп
        Map<String, Integer> wordsMap = new HashMap<>();
        List wordsList = Arrays.asList(wordsArray);
        for (String word : wordsSet) {
            Integer count = Collections.frequency(wordsList, word);
            wordsMap.put(word, count);
        }
        // вывод на консоль
        System.out.println("Количество повторений слов (вариант 1): \n" + wordsMap.toString());

        // подсчет количества слов в массиве - вариант 2 (без сета, в один проход)
        Map<String, Integer> wordsMap2 = new HashMap<>();
        for (String word : wordsArray) {
            Integer currentCount = wordsMap2.get(word);
            if (currentCount == null)
                wordsMap2.put(word, 1);
            else
                wordsMap2.put(word, currentCount + 1);
        }

        // вывод статистики на консоль
        System.out.println("Количество повторений слов (вариант 2): \n" + wordsMap2.toString());

        // Поиск слова с максимальным количеством повторений - вариант 1
        // определение максимального количества повторений
        Integer maxCount = Collections.max(wordsMap.values());
        // Поиск первого слова с этим количеством повторений
        String wordMaxCount = "";
        for (Map.Entry entry : wordsMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                wordMaxCount = entry.getKey().toString();
                break;
            }
        }
        System.out.println("Максимальное количество повторений (вариант 1)\n" +
                "Слово: \"" + wordMaxCount + "\", повторений: " + maxCount);

        String wordMaxCount2 = "";
        Integer maxCount2 = 0;

        // Поиск слова с максимальным количеством повторений - вариант 2
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            Integer num = entry.getValue();
            if (num > maxCount2) {
                maxCount2 = num;
                wordMaxCount2 = entry.getKey();
            }
        }
        System.out.println("Максимальное количество повторений (вариант 2)\n" +
                "Слово: \"" + wordMaxCount2 + "\", повторений: " + maxCount2);
    }
}
