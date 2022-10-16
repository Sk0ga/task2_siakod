package Reverse;

import Interface.EncryptionReverseInterface;

public abstract class BaseDecorator implements EncryptionReverseInterface {

    protected EncryptionReverseInterface encryptionInterface;

    public BaseDecorator(EncryptionReverseInterface encryptionInterface) {
        this.encryptionInterface = encryptionInterface;
    }

    public String encryptAndDecryptReverse(String str) {
        return this.encryptionInterface.encryptAndDecryptReverse(str);
    }

    // public String decryptReverse(String str) {
    // return this.encryptionInterface.decryptReverse(str);
    // }

}
