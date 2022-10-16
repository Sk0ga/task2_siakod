package Number;

import Interface.EncryptionNumberInterface;

public class NumberEncryptor implements EncryptionNumberInterface {

    @Override
    public String encryptNumber(String str) {
        str = str + "666";

        return str;
    }

    @Override
    public String decryptNumber(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char c : charArray) {
            if (c != '6') {
                result.append(c);
            }
        }

        return result.toString();
    }
}
