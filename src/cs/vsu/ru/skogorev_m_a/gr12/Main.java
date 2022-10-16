package cs.vsu.ru.skogorev_m_a.gr12;

import Interface.EncryptionLetterInterface;
import Interface.EncryptionNumberInterface;
import Interface.EncryptionReverseInterface;
import Number.NumberEncryptor;
import Number.NumberEncryptorDecorator;
import Letter.LetterEncryptor;
import Letter.LetterEncryptorDecorator;
import Reverse.ReverseEncryptorDecorator;
import Reverse.ReverseEncryptor;

public class Main {
    public static void main(String[] args) {

        EncryptionNumberInterface numberEncryptor = new NumberEncryptorDecorator(new NumberEncryptor());
        EncryptionLetterInterface letterEncryptor = new LetterEncryptorDecorator(new LetterEncryptor());
        EncryptionReverseInterface reverseEncryptor = new ReverseEncryptorDecorator(new ReverseEncryptor());

        String encrypted = letterEncryptor.encryptLetter("football");
        encrypted = reverseEncryptor.encryptAndDecryptReverse(encrypted);
        encrypted = numberEncryptor.encryptNumber(encrypted);
        System.out.println(encrypted);

        String decrypted = letterEncryptor.decryptLetter(encrypted);
        decrypted = numberEncryptor.decryptNumber(decrypted);
        decrypted = reverseEncryptor.encryptAndDecryptReverse(decrypted);
        System.out.println(decrypted);

    }
}
