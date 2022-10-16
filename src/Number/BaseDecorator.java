package Number;

import Interface.EncryptionNumberInterface;

public abstract class BaseDecorator implements EncryptionNumberInterface {

    protected EncryptionNumberInterface encryptionInterface;

    public BaseDecorator(EncryptionNumberInterface encryptionInterface) {
        this.encryptionInterface = encryptionInterface;
    }

    public String encryptNumber(String str) {
        return this.encryptionInterface.encryptNumber(str);
    }

    public String decryptNumber(String str) {
        return this.encryptionInterface.decryptNumber(str);
    }

}