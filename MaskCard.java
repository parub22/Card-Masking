package np.com.card;

/**
 *
 * @author Parbati Budhathoki <parbatibudhathoki3@gmail.com>
 * @Creation Date Jun 26, 2019 12:32:28 PM
 */
public class MaskCard{

    public static void main(String[] args) {
        String cardNum = "4111110065031111";
        final int STARTLENGTH = 6;   //first digit of card you don't want to mask
        final int ENDLENGTH = 4;    //last digit of card you don't want to mask
        int maskedLength = cardNum.length() - (STARTLENGTH + ENDLENGTH);
        System.out.println(maskedLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maskedLength; i++) {
            sb.append("X");
        }
        String maskedCard = cardNum.substring(0, STARTLENGTH) + sb + cardNum.substring(cardNum.length() - ENDLENGTH, cardNum.length());
        System.out.println(maskedCard);
    }

}
