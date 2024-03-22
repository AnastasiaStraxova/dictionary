/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dictionary;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author ПК
 */
public class Dictionary {

    public static void main(String[] args) {
        System.out.println("Практическое задание № 4. Вариант 5. Страхова А.А. РИБО-02-22");
        HashMap<String,String> wordsMap = new HashMap<>();
        wordsMap.put("Book", "книга");
        wordsMap.put("Ice cream", "мороженое");
        wordsMap.put("Dog", "собака");
        wordsMap.put("Smart", "умный");
        wordsMap.put("Fiber optics", "волоконная оптика");
        System.out.println("Текущее содержание словаря:");
        for(Entry<String,String> entr : wordsMap.entrySet()){
            String eng = entr.getKey();
            String rus = entr.getValue();
            System.out.println(eng + " - " + rus);
    }
       System.out.println("________________________________________");
       Scanner scanner = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.println("Выберете действие : 1 - добавить новое слово и перевод; 2 - удалить слово и перевод; 3 - выйти");
            int act = scanner.nextInt();
            scanner.nextLine();
            switch (act) {
                case 1:
                    System.out.println("Введите слово на английском");
                    String word = scanner.nextLine();
                    System.out.println("Введите перевод этого слова на русском");
                    String translation = scanner.nextLine();
                    if(wordsMap.containsKey(word)){
                        System.out.println("Данное слово уже есть в словаре, введённый вами перевод добавится к уже существующему");
                        String earlyTranslation = wordsMap.get(word);
                        String newTranslation = earlyTranslation + ", " + translation;
                        wordsMap.put(word, newTranslation);
                    }else{
                        wordsMap.put(word, translation);
                    }    System.out.println("Текущее содержание словаря:");
                    for(Entry<String,String> entr : wordsMap.entrySet()){
                        String eng = entr.getKey();
                        String rus = entr.getValue();
                        System.out.println(eng + " - " + rus);
                    }    System.out.println("________________________________________");
                    break;
                case 2:
                    System.out.println("Введите на английском слово, которое хотите удалить");
                    String delete = scanner.nextLine();
                    if(wordsMap.containsKey(delete)){
                        wordsMap.remove(delete);
                        System.out.println("Текущее содержание словаря:");
                        for(Entry<String,String> entr : wordsMap.entrySet()){
                            String eng = entr.getKey();
                            String rus = entr.getValue();
                            System.out.println(eng + " - " + rus);
                        }
                        System.out.println("________________________________________");
                    }else{
                        System.out.println("Данного слова нет в словаре");
                    }    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("Ошибка. Попробуйте ещё раз");
                    break;
            }
        }   
    }
}
 
