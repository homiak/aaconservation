/*
 * Copyright (c) 2010 Agnieszka Golicz & Peter Troshin
 *               2017 Syed Asad Rahman
 * 
 * Amino Acid Conservation @version: 1.1 
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the Apache License version 2 as published by the
 * Apache Software Foundation This library is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Apache
 * License for more details. A copy of the license is in apache_license.txt. It
 * is also available here: http://www.apache.org/licenses/LICENSE-2.0.txt 
 * Any republication or derived work distributed in source code form must 
 * include this copyright and license notice.
 * 
 */
package compbio.conservation;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Agnieszka Golicz
 *
 */
final class ConservationSets {

    /**
     * Holds Mirny sets.
     */
    private static final Map<String, HashSet<Character>> MIRNY;
    /**
     * Holds Taylor sets.
     */
    private static final Map<String, HashSet<Character>> TAYLOR;
    /**
     * Holds Wiliamson sets.
     */
    private static final Map<String, HashSet<Character>> WILLIAMSON;
    /**
     * Holds Zvelibil sets.
     */
    private static final Map<String, HashSet<Character>> ZVELIBIL;

    static {
        HashSet<Character> mirAliphatic = new HashSet<>();
        mirAliphatic.add('A');
        mirAliphatic.add('V');
        mirAliphatic.add('L');
        mirAliphatic.add('I');
        mirAliphatic.add('M');
        mirAliphatic.add('C');
        mirAliphatic.add('J');
        mirAliphatic.add('X');
        HashSet<Character> mirAromatic = new HashSet<>();
        mirAromatic.add('F');
        mirAromatic.add('W');
        mirAromatic.add('Y');
        mirAromatic.add('H');
        mirAromatic.add('X');
        HashSet<Character> mirPolar = new HashSet<>();
        mirPolar.add('S');
        mirPolar.add('T');
        mirPolar.add('N');
        mirPolar.add('B');
        mirPolar.add('Q');
        mirPolar.add('Z');
        mirPolar.add('X');
        HashSet<Character> mirPositive = new HashSet<>();
        mirPositive.add('K');
        mirPositive.add('R');
        mirPositive.add('X');
        HashSet<Character> mirNegative = new HashSet<>();
        mirNegative.add('D');
        mirNegative.add('E');
        mirNegative.add('B');
        mirNegative.add('Z');
        mirNegative.add('X');
        HashSet<Character> mirSpecial = new HashSet<>();
        mirSpecial.add('G');
        mirSpecial.add('P');
        mirSpecial.add('X');
        Map<String, HashSet<Character>> sets = new HashMap<>();
        sets.put("aliphatic", mirAliphatic);
        sets.put("aromatic", mirAromatic);
        sets.put("polar", mirPolar);
        sets.put("positive", mirPositive);
        sets.put("negative", mirNegative);
        sets.put("special", mirSpecial);
        MIRNY = Collections.unmodifiableMap(sets);
    }

    static {
        Map<String, HashSet<Character>> willSets = new HashMap<>();
        HashSet<Character> set1 = new HashSet<>();
        set1.add('V');
        set1.add('L');
        set1.add('I');
        set1.add('M');
        set1.add('J');
        set1.add('X');
        HashSet<Character> set2 = new HashSet<>();
        set2.add('F');
        set2.add('W');
        set2.add('Y');
        set2.add('X');
        HashSet<Character> set3 = new HashSet<>();
        set3.add('S');
        set3.add('T');
        set3.add('X');
        HashSet<Character> set4 = new HashSet<>();
        set4.add('N');
        set4.add('Q');
        set4.add('B');
        set4.add('Z');
        set4.add('X');
        HashSet<Character> set5 = new HashSet<>();
        set5.add('H');
        set5.add('K');
        set5.add('R');
        set5.add('X');
        HashSet<Character> set6 = new HashSet<>();
        set6.add('D');
        set6.add('E');
        set6.add('B');
        set6.add('Z');
        set6.add('X');
        HashSet<Character> set7 = new HashSet<>();
        set7.add('A');
        set7.add('G');
        set7.add('X');
        HashSet<Character> set8 = new HashSet<>();
        set8.add('P');
        set8.add('X');
        HashSet<Character> set9 = new HashSet<>();
        set9.add('C');
        set9.add('X');
        willSets.put("set1", set1);
        willSets.put("set2", set2);
        willSets.put("set3", set3);
        willSets.put("set4", set4);
        willSets.put("set5", set5);
        willSets.put("set6", set6);
        willSets.put("set7", set7);
        willSets.put("set8", set8);
        willSets.put("set9", set9);
        WILLIAMSON = Collections.unmodifiableMap(willSets);
    }

    static {
        Map<String, HashSet<Character>> taySets = new HashMap<>();
        HashSet<Character> tayPositive = new HashSet<>();
        tayPositive.add('R');
        tayPositive.add('K');
        tayPositive.add('H');
        tayPositive.add('X');
        HashSet<Character> tayCharged = new HashSet<>();
        tayCharged.add('D');
        tayCharged.add('E');
        tayCharged.add('R');
        tayCharged.add('K');
        tayCharged.add('H');
        tayCharged.add('B');
        tayCharged.add('Z');
        tayCharged.add('X');
        HashSet<Character> chargedNonH = new HashSet<>();
        chargedNonH.add('D');
        chargedNonH.add('E');
        chargedNonH.add('R');
        chargedNonH.add('K');
        chargedNonH.add('B');
        chargedNonH.add('X');
        HashSet<Character> tayNegative = new HashSet<>();
        tayNegative.add('D');
        tayNegative.add('E');
        tayNegative.add('B');
        tayNegative.add('Z');
        tayNegative.add('X');
        HashSet<Character> hydrophilicNonPositive = new HashSet<>();
        hydrophilicNonPositive.add('S');
        hydrophilicNonPositive.add('N');
        hydrophilicNonPositive.add('D');
        hydrophilicNonPositive.add('E');
        hydrophilicNonPositive.add('Q');
        hydrophilicNonPositive.add('B');
        hydrophilicNonPositive.add('Z');
        hydrophilicNonPositive.add('X');
        HashSet<Character> tayHydrophilic = new HashSet<>();
        tayHydrophilic.add('S');
        tayHydrophilic.add('N');
        tayHydrophilic.add('D');
        tayHydrophilic.add('E');
        tayHydrophilic.add('Q');
        tayHydrophilic.add('R');
        tayHydrophilic.add('B');
        tayHydrophilic.add('Z');
        tayHydrophilic.add('X');
        HashSet<Character> chargedOrHydrophilic = new HashSet<>();
        chargedOrHydrophilic.add('S');
        chargedOrHydrophilic.add('N');
        chargedOrHydrophilic.add('D');
        chargedOrHydrophilic.add('E');
        chargedOrHydrophilic.add('Q');
        chargedOrHydrophilic.add('Z');
        chargedOrHydrophilic.add('R');
        chargedOrHydrophilic.add('K');
        chargedOrHydrophilic.add('H');
        chargedOrHydrophilic.add('B');
        chargedOrHydrophilic.add('X');
        HashSet<Character> chargedOrHydrophilicOrP = new HashSet<>();
        chargedOrHydrophilicOrP.add('S');
        chargedOrHydrophilicOrP.add('N');
        chargedOrHydrophilicOrP.add('D');
        chargedOrHydrophilicOrP.add('E');
        chargedOrHydrophilicOrP.add('Q');
        chargedOrHydrophilicOrP.add('Z');
        chargedOrHydrophilicOrP.add('R');
        chargedOrHydrophilicOrP.add('K');
        chargedOrHydrophilicOrP.add('H');
        chargedOrHydrophilicOrP.add('P');
        chargedOrHydrophilicOrP.add('B');
        chargedOrHydrophilicOrP.add('X');
        HashSet<Character> polarNonAromaticOrChargedOrP = new HashSet<>();
        polarNonAromaticOrChargedOrP.add('P');
        polarNonAromaticOrChargedOrP.add('T');
        polarNonAromaticOrChargedOrP.add('S');
        polarNonAromaticOrChargedOrP.add('N');
        polarNonAromaticOrChargedOrP.add('D');
        polarNonAromaticOrChargedOrP.add('E');
        polarNonAromaticOrChargedOrP.add('Q');
        polarNonAromaticOrChargedOrP.add('Z');
        polarNonAromaticOrChargedOrP.add('R');
        polarNonAromaticOrChargedOrP.add('K');
        polarNonAromaticOrChargedOrP.add('H');
        polarNonAromaticOrChargedOrP.add('B');
        polarNonAromaticOrChargedOrP.add('X');
        HashSet<Character> tayPolar = new HashSet<>();
        tayPolar.add('T');
        tayPolar.add('S');
        tayPolar.add('N');
        tayPolar.add('D');
        tayPolar.add('E');
        tayPolar.add('Q');
        tayPolar.add('Z');
        tayPolar.add('R');
        tayPolar.add('K');
        tayPolar.add('H');
        tayPolar.add('W');
        tayPolar.add('Y');
        tayPolar.add('B');
        tayPolar.add('X');
        HashSet<Character> polarOrP = new HashSet<>();
        polarOrP.add('T');
        polarOrP.add('S');
        polarOrP.add('N');
        polarOrP.add('D');
        polarOrP.add('E');
        polarOrP.add('Q');
        polarOrP.add('Z');
        polarOrP.add('R');
        polarOrP.add('K');
        polarOrP.add('H');
        polarOrP.add('W');
        polarOrP.add('Y');
        polarOrP.add('P');
        polarOrP.add('B');
        polarOrP.add('X');
        HashSet<Character> polarNonAromaticOrCharged = new HashSet<>();
        polarNonAromaticOrCharged.add('T');
        polarNonAromaticOrCharged.add('S');
        polarNonAromaticOrCharged.add('N');
        polarNonAromaticOrCharged.add('D');
        polarNonAromaticOrCharged.add('E');
        polarNonAromaticOrCharged.add('Q');
        polarNonAromaticOrCharged.add('Z');
        polarNonAromaticOrCharged.add('R');
        polarNonAromaticOrCharged.add('K');
        polarNonAromaticOrCharged.add('H');
        polarNonAromaticOrCharged.add('B');
        polarNonAromaticOrCharged.add('X');
        HashSet<Character> polarNonAromaticNonPositiveOrP = new HashSet<>();
        polarNonAromaticNonPositiveOrP.add('T');
        polarNonAromaticNonPositiveOrP.add('S');
        polarNonAromaticNonPositiveOrP.add('N');
        polarNonAromaticNonPositiveOrP.add('D');
        polarNonAromaticNonPositiveOrP.add('E');
        polarNonAromaticNonPositiveOrP.add('Q');
        polarNonAromaticNonPositiveOrP.add('Z');
        polarNonAromaticNonPositiveOrP.add('P');
        polarNonAromaticNonPositiveOrP.add('B');
        polarNonAromaticNonPositiveOrP.add('X');
        HashSet<Character> polarNonAromaticNonPositive = new HashSet<>();
        polarNonAromaticNonPositive.add('T');
        polarNonAromaticNonPositive.add('S');
        polarNonAromaticNonPositive.add('N');
        polarNonAromaticNonPositive.add('D');
        polarNonAromaticNonPositive.add('E');
        polarNonAromaticNonPositive.add('Q');
        polarNonAromaticNonPositive.add('Z');
        polarNonAromaticNonPositive.add('B');
        polarNonAromaticNonPositive.add('X');
        HashSet<Character> smallPolarOrP = new HashSet<>();
        smallPolarOrP.add('P');
        smallPolarOrP.add('T');
        smallPolarOrP.add('S');
        smallPolarOrP.add('N');
        smallPolarOrP.add('D');
        smallPolarOrP.add('B');
        smallPolarOrP.add('X');
        HashSet<Character> smallPolar = new HashSet<>();
        smallPolar.add('T');
        smallPolar.add('S');
        smallPolar.add('N');
        smallPolar.add('D');
        smallPolar.add('B');
        smallPolar.add('X');
        HashSet<Character> smallHydrophilic = new HashSet<>();
        smallHydrophilic.add('S');
        smallHydrophilic.add('N');
        smallHydrophilic.add('D');
        smallHydrophilic.add('B');
        smallHydrophilic.add('X');
        HashSet<Character> tayTiny = new HashSet<>();
        tayTiny.add('A');
        tayTiny.add('G');
        tayTiny.add('S');
        tayTiny.add('X');
        HashSet<Character> tinyOrSmallOrPolar = new HashSet<>();
        tinyOrSmallOrPolar.add('A');
        tinyOrSmallOrPolar.add('G');
        tinyOrSmallOrPolar.add('S');
        tinyOrSmallOrPolar.add('T');
        tinyOrSmallOrPolar.add('N');
        tinyOrSmallOrPolar.add('D');
        tinyOrSmallOrPolar.add('B');
        tinyOrSmallOrPolar.add('X');
        HashSet<Character> tinyOrSmallOrPolarOrP = new HashSet<>();
        tinyOrSmallOrPolarOrP.add('A');
        tinyOrSmallOrPolarOrP.add('G');
        tinyOrSmallOrPolarOrP.add('S');
        tinyOrSmallOrPolarOrP.add('T');
        tinyOrSmallOrPolarOrP.add('N');
        tinyOrSmallOrPolarOrP.add('D');
        tinyOrSmallOrPolarOrP.add('B');
        tinyOrSmallOrPolarOrP.add('P');
        tinyOrSmallOrPolarOrP.add('X');
        HashSet<Character> tinyOrNegativeHydrophilicOrT = new HashSet<>();
        tinyOrNegativeHydrophilicOrT.add('A');
        tinyOrNegativeHydrophilicOrT.add('G');
        tinyOrNegativeHydrophilicOrT.add('T');
        tinyOrNegativeHydrophilicOrT.add('S');
        tinyOrNegativeHydrophilicOrT.add('N');
        tinyOrNegativeHydrophilicOrT.add('D');
        tinyOrNegativeHydrophilicOrT.add('B');
        tinyOrNegativeHydrophilicOrT.add('E');
        tinyOrNegativeHydrophilicOrT.add('Q');
        tinyOrNegativeHydrophilicOrT.add('Z');
        tinyOrNegativeHydrophilicOrT.add('X');
        HashSet<Character> tinyOrNegativeHydrophilicOrTOrP = new HashSet<>();
        tinyOrNegativeHydrophilicOrTOrP.add('A');
        tinyOrNegativeHydrophilicOrTOrP.add('G');
        tinyOrNegativeHydrophilicOrTOrP.add('T');
        tinyOrNegativeHydrophilicOrTOrP.add('S');
        tinyOrNegativeHydrophilicOrTOrP.add('N');
        tinyOrNegativeHydrophilicOrTOrP.add('D');
        tinyOrNegativeHydrophilicOrTOrP.add('B');
        tinyOrNegativeHydrophilicOrTOrP.add('E');
        tinyOrNegativeHydrophilicOrTOrP.add('Q');
        tinyOrNegativeHydrophilicOrTOrP.add('Z');
        tinyOrNegativeHydrophilicOrTOrP.add('P');
        tinyOrNegativeHydrophilicOrTOrP.add('X');
        HashSet<Character> tinyOrPolarNonAromatic = new HashSet<>();
        tinyOrPolarNonAromatic.add('A');
        tinyOrPolarNonAromatic.add('G');
        tinyOrPolarNonAromatic.add('T');
        tinyOrPolarNonAromatic.add('S');
        tinyOrPolarNonAromatic.add('N');
        tinyOrPolarNonAromatic.add('D');
        tinyOrPolarNonAromatic.add('B');
        tinyOrPolarNonAromatic.add('E');
        tinyOrPolarNonAromatic.add('Q');
        tinyOrPolarNonAromatic.add('Z');
        tinyOrPolarNonAromatic.add('R');
        tinyOrPolarNonAromatic.add('K');
        tinyOrPolarNonAromatic.add('X');
        HashSet<Character> all = new HashSet<>();
        all.add('A');
        all.add('R');
        all.add('N');
        all.add('D');
        all.add('B');
        all.add('C');
        all.add('Q');
        all.add('E');
        all.add('G');
        all.add('H');
        all.add('I');
        all.add('J');
        all.add('L');
        all.add('K');
        all.add('M');
        all.add('F');
        all.add('P');
        all.add('S');
        all.add('T');
        all.add('W');
        all.add('Y');
        all.add('V');
        all.add('Z');
        all.add('X');
        all.add('-');
        taySets.put("positive", tayPositive);
        taySets.put("charged", tayCharged);
        taySets.put("chargedNonH", chargedNonH);
        taySets.put("negative", tayNegative);
        taySets.put("hydrophilicNonPositive", hydrophilicNonPositive);
        taySets.put("hydrophilic", tayHydrophilic);
        taySets.put("chargedOrHydrophilic", chargedOrHydrophilic);
        taySets.put("chargedOrHydrophilicOrP", chargedOrHydrophilicOrP);
        taySets.put("polarNonAromaticOrChargedOrP",
                polarNonAromaticOrChargedOrP);
        taySets.put("polar", tayPolar);
        taySets.put("polarOrP", polarOrP);
        taySets.put("polarNonAromaticOrCharged", polarNonAromaticOrCharged);
        taySets.put("polarNonAromaticNonPositiveOrP",
                polarNonAromaticNonPositiveOrP);
        taySets.put("polarNoAromaticNonPositive", polarNonAromaticNonPositive);
        taySets.put("smallPolarOrP", smallPolarOrP);
        taySets.put("smallPolar", smallPolar);
        taySets.put("smallHydrophilic", smallHydrophilic);
        taySets.put("tiny", tayTiny);
        taySets.put("tinyOrSmallOrPolar", tinyOrSmallOrPolar);
        taySets.put("tinyOrSmallOrPolarOrP", tinyOrSmallOrPolarOrP);
        taySets.put("tinyOrNegativeHydrophilicOrT",
                tinyOrNegativeHydrophilicOrT);
        taySets.put("tinyOrNegativeHydrophilicOrTOrP",
                tinyOrNegativeHydrophilicOrTOrP);
        taySets.put("tinyOrPolarNonAromatic", tinyOrPolarNonAromatic);
        taySets.put("all", all);
        TAYLOR = Collections.unmodifiableMap(taySets);
    }

    static {
        Map<String, HashSet<Character>> zvelSets = new HashMap<>();
        HashSet<Character> hydrophobic = new HashSet<>();
        hydrophobic.add('I');
        hydrophobic.add('L');
        hydrophobic.add('V');
        hydrophobic.add('C');
        hydrophobic.add('A');
        hydrophobic.add('G');
        hydrophobic.add('M');
        hydrophobic.add('F');
        hydrophobic.add('Y');
        hydrophobic.add('W');
        hydrophobic.add('H');
        hydrophobic.add('K');
        hydrophobic.add('T');
        hydrophobic.add('J');
        hydrophobic.add('X');
        hydrophobic.add('-');
        zvelSets.put("hydrophobic", hydrophobic);
        HashSet<Character> hydrophobicCompl = new HashSet<>();
        hydrophobicCompl.add('R');
        hydrophobicCompl.add('E');
        hydrophobicCompl.add('Q');
        hydrophobicCompl.add('D');
        hydrophobicCompl.add('B');
        hydrophobicCompl.add('N');
        hydrophobicCompl.add('S');
        hydrophobicCompl.add('P');
        hydrophobicCompl.add('B');
        hydrophobicCompl.add('Z');
        hydrophobicCompl.add('X');
        zvelSets.put("hydrophobicCompl", hydrophobicCompl);
        HashSet<Character> polar = new HashSet<>();
        polar.add('Y');
        polar.add('W');
        polar.add('H');
        polar.add('K');
        polar.add('R');
        polar.add('E');
        polar.add('Q');
        polar.add('D');
        polar.add('B');
        polar.add('N');
        polar.add('S');
        polar.add('T');
        polar.add('B');
        polar.add('Z');
        polar.add('X');
        polar.add('-');
        zvelSets.put("polar", polar);
        HashSet<Character> polarCompl = new HashSet<>();
        polarCompl.add('I');
        polarCompl.add('L');
        polarCompl.add('V');
        polarCompl.add('C');
        polarCompl.add('A');
        polarCompl.add('G');
        polarCompl.add('M');
        polarCompl.add('J');
        polarCompl.add('F');
        polarCompl.add('X');
        zvelSets.put("polarCompl", polarCompl);
        HashSet<Character> small = new HashSet<>();
        small.add('V');
        small.add('C');
        small.add('A');
        small.add('G');
        small.add('D');
        small.add('N');
        small.add('S');
        small.add('T');
        small.add('P');
        small.add('B');
        small.add('X');
        small.add('-');
        zvelSets.put("small", small);
        HashSet<Character> smallCompl = new HashSet<>();
        smallCompl.add('I');
        smallCompl.add('L');
        smallCompl.add('M');
        smallCompl.add('F');
        smallCompl.add('Y');
        smallCompl.add('W');
        smallCompl.add('H');
        smallCompl.add('K');
        smallCompl.add('R');
        smallCompl.add('E');
        smallCompl.add('Q');
        smallCompl.add('B');
        smallCompl.add('J');
        smallCompl.add('Z');
        smallCompl.add('X');
        zvelSets.put("smallCompl", smallCompl);
        HashSet<Character> proline = new HashSet<>();
        proline.add('P');
        proline.add('X');
        proline.add('-');
        zvelSets.put("proline", proline);
        HashSet<Character> prolineCompl = new HashSet<>();
        prolineCompl.add('I');
        prolineCompl.add('L');
        prolineCompl.add('V');
        prolineCompl.add('C');
        prolineCompl.add('A');
        prolineCompl.add('G');
        prolineCompl.add('M');
        prolineCompl.add('F');
        prolineCompl.add('Y');
        prolineCompl.add('W');
        prolineCompl.add('H');
        prolineCompl.add('K');
        prolineCompl.add('R');
        prolineCompl.add('E');
        prolineCompl.add('Q');
        prolineCompl.add('D');
        prolineCompl.add('N');
        prolineCompl.add('S');
        prolineCompl.add('T');
        prolineCompl.add('B');
        prolineCompl.add('Z');
        prolineCompl.add('J');
        prolineCompl.add('X');
        zvelSets.put("prolineCompl", prolineCompl);
        HashSet<Character> tiny = new HashSet<>();
        tiny.add('A');
        tiny.add('G');
        tiny.add('S');
        tiny.add('X');
        tiny.add('-');
        zvelSets.put("tiny", tiny);
        HashSet<Character> tinyCompl = new HashSet<>();
        tinyCompl.add('I');
        tinyCompl.add('L');
        tinyCompl.add('V');
        tinyCompl.add('C');
        tinyCompl.add('M');
        tinyCompl.add('F');
        tinyCompl.add('Y');
        tinyCompl.add('W');
        tinyCompl.add('H');
        tinyCompl.add('K');
        tinyCompl.add('R');
        tinyCompl.add('E');
        tinyCompl.add('Q');
        tinyCompl.add('D');
        tinyCompl.add('N');
        tinyCompl.add('T');
        tinyCompl.add('P');
        tinyCompl.add('B');
        tinyCompl.add('Z');
        tinyCompl.add('J');
        tinyCompl.add('X');
        zvelSets.put("tinyCompl", tinyCompl);
        HashSet<Character> aliphatic = new HashSet<>();
        aliphatic.add('I');
        aliphatic.add('L');
        aliphatic.add('V');
        aliphatic.add('X');
        aliphatic.add('J');
        aliphatic.add('-');
        zvelSets.put("aliphatic", aliphatic);
        HashSet<Character> aliphaticCompl = new HashSet<>();
        aliphaticCompl.add('C');
        aliphaticCompl.add('A');
        aliphaticCompl.add('G');
        aliphaticCompl.add('M');
        aliphaticCompl.add('F');
        aliphaticCompl.add('Y');
        aliphaticCompl.add('W');
        aliphaticCompl.add('H');
        aliphaticCompl.add('K');
        aliphaticCompl.add('R');
        aliphaticCompl.add('E');
        aliphaticCompl.add('Q');
        aliphaticCompl.add('D');
        aliphaticCompl.add('N');
        aliphaticCompl.add('S');
        aliphaticCompl.add('T');
        aliphaticCompl.add('P');
        aliphaticCompl.add('B');
        aliphaticCompl.add('Z');
        aliphaticCompl.add('X');
        zvelSets.put("aliphaticCompl", aliphaticCompl);
        HashSet<Character> aromatic = new HashSet<>();
        aromatic.add('F');
        aromatic.add('Y');
        aromatic.add('W');
        aromatic.add('H');
        aromatic.add('X');
        aromatic.add('-');
        zvelSets.put("aromatic", aromatic);
        HashSet<Character> aromaticCompl = new HashSet<>();
        aromaticCompl.add('I');
        aromaticCompl.add('L');
        aromaticCompl.add('V');
        aromaticCompl.add('C');
        aromaticCompl.add('A');
        aromaticCompl.add('G');
        aromaticCompl.add('M');
        aromaticCompl.add('K');
        aromaticCompl.add('R');
        aromaticCompl.add('E');
        aromaticCompl.add('Q');
        aromaticCompl.add('D');
        aromaticCompl.add('N');
        aromaticCompl.add('S');
        aromaticCompl.add('T');
        aromaticCompl.add('P');
        aromaticCompl.add('B');
        aromaticCompl.add('Z');
        aromaticCompl.add('J');
        aromaticCompl.add('X');
        zvelSets.put("aromaticCompl", aromaticCompl);
        HashSet<Character> positive = new HashSet<>();
        positive.add('W');
        positive.add('H');
        positive.add('K');
        positive.add('R');
        positive.add('X');
        positive.add('-');
        zvelSets.put("positive", positive);
        HashSet<Character> positiveCompl = new HashSet<>();
        positiveCompl.add('I');
        positiveCompl.add('L');
        positiveCompl.add('V');
        positiveCompl.add('C');
        positiveCompl.add('A');
        positiveCompl.add('G');
        positiveCompl.add('M');
        positiveCompl.add('F');
        positiveCompl.add('Y');
        positiveCompl.add('E');
        positiveCompl.add('Q');
        positiveCompl.add('D');
        positiveCompl.add('N');
        positiveCompl.add('S');
        positiveCompl.add('T');
        positiveCompl.add('P');
        positiveCompl.add('B');
        positiveCompl.add('Z');
        positiveCompl.add('J');
        positiveCompl.add('X');
        zvelSets.put("positiveCompl", positiveCompl);
        HashSet<Character> negative = new HashSet<>();
        negative.add('E');
        negative.add('D');
        negative.add('B');
        negative.add('N');
        negative.add('X');
        negative.add('Z');
        negative.add('-');
        zvelSets.put("negative", negative);
        HashSet<Character> negativeCompl = new HashSet<>();
        negativeCompl.add('I');
        negativeCompl.add('L');
        negativeCompl.add('V');
        negativeCompl.add('C');
        negativeCompl.add('A');
        negativeCompl.add('G');
        negativeCompl.add('M');
        negativeCompl.add('F');
        negativeCompl.add('Y');
        negativeCompl.add('W');
        negativeCompl.add('H');
        negativeCompl.add('K');
        negativeCompl.add('R');
        negativeCompl.add('Q');
        negativeCompl.add('S');
        negativeCompl.add('T');
        negativeCompl.add('P');
        negativeCompl.add('B');
        negativeCompl.add('Z');
        negativeCompl.add('J');
        negativeCompl.add('X');
        zvelSets.put("negativeCompl", negativeCompl);
        HashSet<Character> charged = new HashSet<>();
        charged.add('H');
        charged.add('K');
        charged.add('R');
        charged.add('E');
        charged.add('D');
        charged.add('B');
        charged.add('Z');
        charged.add('X');
        charged.add('-');
        zvelSets.put("charged", charged);
        HashSet<Character> chargedCompl = new HashSet<>();
        chargedCompl.add('I');
        chargedCompl.add('L');
        chargedCompl.add('V');
        chargedCompl.add('C');
        chargedCompl.add('A');
        chargedCompl.add('G');
        chargedCompl.add('M');
        chargedCompl.add('F');
        chargedCompl.add('Y');
        chargedCompl.add('W');
        chargedCompl.add('Q');
        chargedCompl.add('N');
        chargedCompl.add('S');
        chargedCompl.add('T');
        chargedCompl.add('P');
        chargedCompl.add('B');
        chargedCompl.add('Z');
        chargedCompl.add('J');
        chargedCompl.add('X');
        zvelSets.put("chargedCompl", chargedCompl);
        ZVELIBIL = Collections.unmodifiableMap(zvelSets);
    }

    /**
     * Gets Taylor sets
     *
     * @return sets
     */
    static Map<String, HashSet<Character>> taylorSets() {

        return TAYLOR;
    }

    /**
     * Gets Mirny sets.
     *
     * @return sets
     */
    static Map<String, HashSet<Character>> mirnySets() {

        return MIRNY;
    }

    /**
     * Gets Williamson sets.
     *
     * @return sets
     */
    static Map<String, HashSet<Character>> williamsonSets() {

        return WILLIAMSON;
    }

    /**
     * Gets Zvelibil sets.
     *
     * @return sets
     */
    static Map<String, HashSet<Character>> zvelibilSets() {

        return ZVELIBIL;
    }
}
