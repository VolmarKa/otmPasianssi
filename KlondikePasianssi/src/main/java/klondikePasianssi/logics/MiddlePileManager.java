package klondikePasianssi.logics;

import klondikePasianssi.gui.Card;
import klondikePasianssi.gui.MiddlePileView;

public class MiddlePileManager {

    private double y;
    private int b;
    private final MiddlePileView[] piles = new MiddlePileView[7];

    public MiddlePileManager(Deck deck) {
        init();
        dealCards(deck);
    }

    private void init() {
        for (int i = 0; i <= 6; i++) {
            this.piles[i] = new MiddlePileView();
        }
    }

    private void dealCards(Deck deck) {
        deck.setEveryFaceDown();
        this.b = 1;
        for (int a = 0; a <= 6; a++) {
            for (int i = 1; i <= b; i++) {
                //System.out.println(deck.getDeck().peek());
                Card card = deck.getDeck().pop();
                this.y = card.getTranslateY();
                this.piles[a].getPile().push(card);
                System.out.println(this.piles[a].getPile().toString());
                this.piles[a].getChildren().add(card);
                card.setTranslateY(y + i * 10);

                //System.out.println("Onnistui" + b);
            }
            this.b++;
        }

        setFirstCardFaceUp();

    }

    private void setFirstCardFaceUp() {
        for (int i = 0; i <= 6; i++) {
            this.piles[i].getPile().peek().getCardProperties().setFaceUp();
        }
    }

    private void changeSideUpdate() {

        for (int i = 0; i <= 6; i++) {
            this.piles[i].getPile().peek().getCardProperties().changeSide();
            //System.out.println(this.piles[i].getPile().peek().getFaceUp());
        }
    }

    public MiddlePileView[] getPiles() {
        return this.piles;
    }
}