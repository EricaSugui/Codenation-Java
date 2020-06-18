package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        final Integer moveForward = 3;
        return encode(texto, moveForward);
    }

    @Override
    public String descriptografar(String texto) {
        final Integer moveBackward = -3;
        return encode(texto, moveBackward);
    }

    private String encode(String text, Integer positionNumber) {
        try {
            validateInput(text);
            StringBuilder decodedString = new StringBuilder();
            char[] characters = text.trim().toLowerCase().toCharArray();
            for(int i=0; i< characters.length; i++) {
                if(characters[i] >= 97 && characters[i]<=122){
                    decodedString.append(calcNewChar(characters[i], positionNumber));
                } else {
                    decodedString.append(characters[i]);
                }
            }
            return decodedString.toString();
        } catch (Exception e) {
            e.getStackTrace();
            throw e;
        }
    }

    private char calcNewChar(char oldChar,Integer positionNumber) {
		char newChar = (char) (oldChar + positionNumber);
		if (newChar >= 97 && newChar <= 122) {
			return newChar;
		} else {
			newChar = (char) (newChar + 26);
			return newChar;
		}
    }
    
    private void validateInput(String text) {
		if (text == null) {
			throw new NullPointerException("Texto está nulo");
		}

		if (text.isEmpty()) {
			throw new IllegalArgumentException("Texto está nulo");
		}
	}

}
