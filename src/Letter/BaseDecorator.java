package Letter;

import Interface.EncryptionLetterInterface;

public abstract class BaseDecorator implements EncryptionLetterInterface {

    protected EncryptionLetterInterface encryptionInterface;

    public BaseDecorator(EncryptionLetterInterface encryptionInterface) {
        this.encryptionInterface = encryptionInterface;
    }

    public String encryptLetter(String str) {
        return this.encryptionInterface.encryptLetter(str);
    }

    public String decryptLetter(String str) {
        return this.encryptionInterface.decryptLetter(str);
    }

}