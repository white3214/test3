package top.tntok.autobot;

/**
 * Utility class for Base64 encoding and decoding
 */
public final class Base64Utils {
    // Encoding modes
    public static final int DEFAULT = 0;
    public static final int URL_SAFE = 1;
    public static final int NO_PADDING = 2;
    public static final int NO_WRAP = 4;

    private static final byte[] ENCODE_TABLE = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'
    };

    private static final byte[] URL_SAFE_ENCODE_TABLE = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'
    };

    private static final int[] DECODE_TABLE = new int[256];
    private static final int[] URL_SAFE_DECODE_TABLE = new int[256];

    static {
        // Initialize decode tables
        buildDecodeTable(ENCODE_TABLE, DECODE_TABLE);
        buildDecodeTable(URL_SAFE_ENCODE_TABLE, URL_SAFE_DECODE_TABLE);
    }

    private static void buildDecodeTable(byte[] encodeTable, int[] decodeTable) {
        Arrays.fill(decodeTable, -1);
        for (int i = 0; i < encodeTable.length; i++) {
            decodeTable[encodeTable[i]] = i;
        }
    }
}