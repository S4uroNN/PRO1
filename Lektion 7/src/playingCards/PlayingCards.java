package playingCards;

public class PlayingCards {
    String Des = "";
    String Description(String card){
        if (card.contains("2")){
            Des = "Two ";
        }else if(card.contains("3")){
            Des = "Three ";
        }else if(card.contains("4")){
            Des = "Four ";
        }else if(card.contains("5")){
            Des = "Five ";
        }else if(card.contains("6")){
            Des = "Six ";
        }else if(card.contains("7")){
            Des = "Seven ";
        }else if(card.contains("8")){
            Des = "Eight ";
        }else if(card.contains("9")){
            Des = "Nine ";
        }else if(card.contains("10")){
            Des = "Ten ";
        }else if(card.contains("K")){
            Des = "King ";
        }else if(card.contains("Q")){
            Des = "Queen ";
        }else if(card.contains("J")){
            Des = "Jack ";
        }else if(card.contains("A")){
            Des = "Ace ";
        }else{
            Des = "Unknown";
        }

        if (card.contains("s")){
            Des = Des + "of spades";
        }else if(card.contains("h")){
            Des = Des + "of hearts";
        }else if(card.contains("d")){
            Des = Des + "of diamonds";
        }else if(card.contains("c")){
            Des = Des + "of clubs";
        } else{
            Des = "unknown";
        }
        return Des;
    }

}
