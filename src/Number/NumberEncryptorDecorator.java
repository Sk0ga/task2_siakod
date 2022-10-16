package Number;

import Interface.EncryptionNumberInterface;

public class NumberEncryptorDecorator extends BaseDecorator {

    public NumberEncryptorDecorator(EncryptionNumberInterface encryptionInterface) {
        super(encryptionInterface);
    }

    @Override
    public String encryptNumber(String str) {
        return encryptionInterface.encryptNumber(str);
    }

    @Override
    public String decryptNumber(String str) {
        return encryptionInterface.decryptNumber(str);
    }

}
