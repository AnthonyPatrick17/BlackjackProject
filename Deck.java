import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck extends Actor
{
    private List<Card> cards;
    
    public Deck(){
        cards = new ArrayList<Card>();
    }
    
    public Deck(int numOfDecks){
        int numOfCards = numOfDecks*52;
        cards = new ArrayList<Card>(numOfCards);
        for (int deckCount=0; deckCount < numOfDecks; deckCount++) {
            for(Suit suit: Suit.values()){
                for(Rank rank: Rank.values()){
                    if (rank == Rank.JOKER){
                        continue;
                    }
                    cards.add(new Card(rank,suit));
                }
            }
        }
        shuffle();
        if (numOfCards > 0){
            setImage(cards.get(numOfCards-1).getImage());
        }
    }
    
    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null; // Deck is empty, return null or handle accordingly
        }
    }
    public void shuffle(){
        Random rand = new Random();
        int numOfCards = cards.size();
        for(int index = 0; index < numOfCards-1; index++){
            int swapIndex = rand.nextInt(numOfCards-index) + index;
            Card temp = cards.get(index);
            cards.add(index, cards.get(swapIndex));
            cards.add(swapIndex, temp);
        }
    }
    
    public boolean isEmpty(){
        return cards.isEmpty();
    }

    public boolean remove(Card aCard){
        return cards.remove(aCard);
    }

    public void add(Card aCard){
        cards.add(aCard);
    }
    
    public Card deal(boolean isFaceUp){
        Card topCard = deal();
        if (isFaceUp){
            topCard.show();
        }
        return topCard;
    }
    
    public Card deal(){
        return cards.remove(cards.size()-1);
    }
    
    public void deal(Deck[] deck, int numOfCardsToDeal, boolean isFaceUp){
        int maxCardCount = numOfCardsToDeal*deck.length;
        for (int cardCount=0; cardCount < maxCardCount; cardCount++){
            Card card = deal(isFaceUp);
            deck[cardCount % deck.length].add(card);
        }
    }
    
    public int getSize(){
        return cards.size();
    }
    
    protected List<Card> getCards(){
        return cards;    
    }
    
    @Override
    public String toString() {
        String str = "";
        for(Card c: cards){
            if (str.length() > 0){
                str +=", ";
            }
            str += c;
        }
        return str;
    }
    
    /**
     * Act - do whatever the Deck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
