package Reverse;

import Interface.EncryptionReverseInterface;

public class ReverseEncryptor implements EncryptionReverseInterface {

    @Override
    public String encryptAndDecryptReverse(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        String encryptedString = new String(charArray);

        return encryptedString;
    }

    // @Override
    // public String decryptReverse(String str) {
    // char[] charArray = str.toCharArray();

    // for (int i = 0; i < charArray.length / 2; i++) {
    // char temp = charArray[i];
    // charArray[i] = charArray[charArray.length - 1 - i];
    // charArray[charArray.length - 1 - i] = temp;
    // }

    // String encryptedString = new String(charArray);

    // return encryptedString;
    // }

}
