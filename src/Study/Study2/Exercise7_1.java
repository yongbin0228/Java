package Study.Study2;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i=0; i<cards.length; i++){
            int a = i%10+1;
            if(i<10&&((a==1)||(a==3)||(a==8)))
                cards[i] = new SutdaCard(a,true);
            else
                cards[i] = new SutdaCard(a,false);
        }
    }
    SutdaCard pick(){
        int num = (int)(Math.random()*20);
        return cards[num];
    }
    SutdaCard pick(int index){
        return cards[index];
    }
    void shuffle(){
        SutdaCard tmp;
        for(int i=0; i<cards.length; i++){
            int rnum = (int)(Math.random()*20);
            tmp = cards[i];
            cards[i] = cards[rnum];
            cards[rnum] = tmp;
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
