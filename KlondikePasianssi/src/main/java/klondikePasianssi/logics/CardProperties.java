package klondikePasianssi.logics;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import klondikePasianssi.gui.Card;
import klondikePasianssi.gui.CardImage;

public class CardProperties {

    protected final String idleButton = "-fx-background-color: transparent; "
            + "-fx-padding: 5, 5, 5, 5;";
    protected final String enteredButton = "-fx-background-color: transparent; "
            + "-fx-padding: 6, 4, 4, 6;";
    private Card card;
    private final Image backImage;
    private final CardImage cardImage = new CardImage();

    public CardProperties(Card card) {
        this.card = card;
        this.backImage = cardImage.backOfTheCard();
    }

    public void init(Image image) {
        card.setStyle(idleButton);
        card.setGraphic(new ImageView(image));
    }

    public void setFaceDown() {
        this.card.setGraphic(new ImageView(this.backImage));
        this.card.setFaceDown();
    }

    public void setFaceUp() {
        this.card.setGraphic(new ImageView(this.card.getImage()));
        this.card.setFaceUp();
    }

    //tässä on joku outo ongelma. Se taitaa yrittää vaihtaa puolta vaikka faceUp
    public void changeSide() {
        ImageView ima2 = new ImageView(card.getImage());
        if (!card.getFaceUp()) {
            card.setOnMouseClicked(event -> {
                card.setGraphic(ima2);
                System.out.println("changed");
                card.setFaceUp();
            });
        }
    }

    public void effect() {
        if (card.getFaceUp()) {
            card.setOnMouseEntered(event -> {
                card.setStyle(enteredButton);
            });

            card.setOnMouseExited(event -> {
                card.setStyle(idleButton);
            });
        }
    }
    /*
    public void move(Scene s){
        card.setOnMousePressed(e -> {
            
        });
    }
    
    
     */
}