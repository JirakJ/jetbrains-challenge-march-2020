package com.jakubjirak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String code = "48 61 76 65 20 79 6f 75 20 73 65 65 6e 20 74 68 65 20 73 6f 75 72 63 65 20 63 6f 64 65 20 6f 66 20 74 68 65 20 4a 65 74 42 72 61 69 6e 73 20 77 65 62 73 69 74 65 3f";
        Arrays.stream(code.split(" "))
                .map((s) -> (char)Integer.decode("0x" + s).intValue())
                .forEach(System.out::print);

        printClueFromWebsite();
        System.out.println("Goto https://www.jetbrains.com/products.html# and find out product JK, than click on learn more.");

        printClueFromProductDetail();

        System.out.println("Now we have to findout count of prime numbers in given range.");

        System.out.println("Solution is https://jb.gg/"+countOfPrimesInRange(500,5000));
        System.out.println("This link will redirect as to pycharm forum, where is billiard table with YouTrack issue number. Now we have find out this issue MPS-31816.");
        System.out.println("https://youtrack.jetbrains.com/issue/MPS-31816");

        printInputFromYouTrack();
        if(encrypt("Good luck!", 3).equals("Jrrg#oxfn$")) {
            String inputFromYouTrack = "Qlfh$#Li#|rx#duh#uhdglqj#wklv#|rx#pxvw#kdyh#zrunhg#rxw#krz#wr#ghfu|sw#lw1#Wklv#lv#rxu#lvvxh#wudfnhu#ghvljqhg#iru#djloh#whdpv1#Lw#lv#iuhh#iru#xs#wr#6#xvhuv#lq#Forxg#dqg#iru#43#xvhuv#lq#Vwdqgdorqh/#vr#li#|rx#zdqw#wr#jlyh#lw#d#jr#lq#|rxu#whdp#wkhq#zh#wrwdoo|#uhfrpphqg#lw1#|rx#kdyh#ilqlvkhg#wkh#iluvw#Txhvw/#qrz#lw“v#wlph#wr#uhghhp#|rxu#iluvw#sul}h1#Wkh#frgh#iru#wkh#iluvw#txhvw#lv#‟WkhGulyhWrGhyhors†1#Jr#wr#wkh#Txhvw#Sdjh#dqg#xvh#wkh#frgh#wr#fodlp#|rxu#sul}h1#kwwsv=22zzz1mhweudlqv1frp2surpr2txhvw2";
            System.out.println(decrypt(inputFromYouTrack, 3));
        }


        System.out.println("Now we should move to page which we decrypt:");
        System.out.println("https://www.jetbrains.com/promo/quest/");
        System.out.println("And fill in our email address and decrypted code.");
        System.out.println("After that jetbeains will send to you price which is 3 months for all jetbrains application.");
        System.out.println("You can redeem given code here:");
        System.out.println("https://www.jetbrains.com/store/redeem/");
    }

    private static void printClueFromProductDetail() {
        System.out.println();
        System.out.println("You have discovered our JetBrains Quest! If you don’t know what this is, you should start from Twitter, Facebook or LinkedIn.");
        System.out.println();
        System.out.println("To continue to the next challenge you need to go to the following link… But there is a problem, the last 3 digits are missing:");
        System.out.println();
        System.out.println("https://jb.gg/###");
        System.out.println();
        System.out.println("To get these digits you need to know how many prime numbers there are between 500 and 5000");
        System.out.println();
        System.out.println("Good Luck!");
        System.out.println();
    }

    public static void printClueFromWebsite() {
        System.out.println();
        System.out.println("<!--");
        System.out.println("        O");
        System.out.println("{o)xxx|===============-");
        System.out.println("        O");
        System.out.println();
        System.out.println("Welcome to the JetBrains Quest.");
        System.out.println();
        System.out.println("What awaits ahead is a series of challenges. Each one will require a little initiative, a little thinking, and a whole lot of JetBrains to get to the end. Cheating is allowed and in some places encouraged. You have until the 15th of March at 12:00 CET to finish the 3 quests." );
        System.out.println("Getting to the end of each quest will earn you a reward.");
        System.out.println("Let the quest commence!");
        System.out.println();
        System.out.println("JetBrains has a lot of products, but there is one that looks like a joke on our Products page, you should start there...");
        System.out.println("It’s dangerous to go alone take this key: Good luck! == Jrrg#oxfn$");
        System.out.println();
        System.out.println("O");
        System.out.println("-===============|xxx(o}");
        System.out.println("O");
        System.out.println("-->");
        System.out.println();
    }

    public static void printInputFromYouTrack() {
        System.out.println();
        System.out.println("JetBrains Quest");
        System.out.println();
        System.out.println("“The key is to think back to the beginning.” – The JetBrains Quest team");
        System.out.println();
        System.out.println("Qlfh$#Li#|rx#duh#uhdglqj#wklv#|rx#pxvw#kdyh#zrunhg#rxw#krz#wr#ghfu|sw#lw1#Wklv#lv#rxu#lvvxh#wudfnhu#ghvljqhg#iru#djloh#whdpv1#Lw#lv#iuhh#iru#xs#wr#6#xvhuv#lq#Forxg#dqg#iru#43#xvhuv#lq#Vwdqgdorqh/#vr#li#|rx#zdqw#wr#jlyh#lw#d#jr#lq#|rxu#whdp#wkhq#zh#wrwdoo|#uhfrpphqg#lw1#|rx#kdyh#ilqlvkhg#wkh#iluvw#Txhvw/#qrz#lw“v#wlph#wr#uhghhp#|rxu#iluvw#sul}h1#Wkh#frgh#iru#wkh#iluvw#txhvw#lv#‟WkhGulyhWrGhyhors†1#Jr#wr#wkh#Txhvw#Sdjh#dqg#xvh#wkh#frgh#wr#fodlp#|rxu#sul}h1#kwwsv=22zzz1mhweudlqv1frp2surpr2txhvw2");
        System.out.println();
    }

    public static int countOfPrimesInRange(int from, int to) {
        int count=0;
        for(int i=from; i < to; i++) {

            boolean isPrime = true;
            for(int j=2; j < i ; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                count++;
            }
        }
        return count;
    }

    public static String encrypt (String srcString, int shift)
    {
        char[] result = new char[srcString.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) (srcString.charAt(i) + shift);
        }
        return new String(result);
    }

    public static String decrypt (String srcString, int shift)
    {
        char[] result = new char[srcString.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) (srcString.charAt(i) - shift);
        }
        return new String(result);
    }
}
