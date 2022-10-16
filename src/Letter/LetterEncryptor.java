package Letter;

import Interface.EncryptionLetterInterface;

public class LetterEncryptor implements EncryptionLetterInterface {

    @Override
    public String encryptLetter(String str) {
        str = str.replaceAll("(.)", "$1%");

        return str;
    }

    @Override
    public String decryptLetter(String str) {
        str = str.replaceAll("%", "");

        return str;
    }
}
