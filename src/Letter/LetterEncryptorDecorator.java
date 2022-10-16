package Letter;

import Interface.EncryptionLetterInterface;

public class LetterEncryptorDecorator extends BaseDecorator {

    public LetterEncryptorDecorator(EncryptionLetterInterface encryptionInterface) {
        super(encryptionInterface);
    }

    @Override
    public String encryptLetter(String str) {
        return encryptionInterface.encryptLetter(str);
    }

    @Override
    public String decryptLetter(String str) {
        return encryptionInterface.decryptLetter(str);
    }

}
