import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class HashAttempt {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] x = "Cao Thi Khanh Ly".getBytes();
		//each letter is translated into a byte, a number, even space has
		//a byte of 32.
		
		byte y = 0b01010010;//1 byte = 8 bit up to 0 first digit b/c it represents
		//both positive and negative values
		for(byte b :x){
			System.out.print(b + " ");
			};
		md.update(x);
		md.digest();
		//System.out.println(md.digest().toString());
//char[] c = string.toCharArray();
//String.valueOf(char[])
		System.out.println();
		
		//array of bytes to hex
		
		for(byte b :x){
			System.out.print(Integer.toHexString((int)b));
		}
		System.out.println();
		
		System.out.println(bytesToHex(x));
		
	}
	
//https://gist.github.com/avilches/750151
	
	public static String bytesToHex(byte[] bytes) {
        StringBuffer result = new StringBuffer();
        for (byte byt : bytes) {result.append( Integer.toString((byt & 0xff) + 0x100, 16).substring(1) );
        System.out.println(result);};
        return result.toString();
    }
	
	/*0x100: 256
	 * The hex literal 0xFF is an equal int(255) = 
	 * 00000000 00000000 00000000 11111111
	 * It help to reduce lot of codes. It is occasionally used in RGB values which consist of 8bits.


	 * When you do a bitwise AND of 0xFF and any value from 0 to 255, the result is the exact same as the value. And if any value higher than 255 still the result will be within 0-255.

When you do a bitwise AND of 0xFF and any value from 0 to 255, the result is the exact same as the value. And if any value higher than 255 still the result will be within 0-255.


bytes[i] & 0xff
widens the byte at position i to an int value with zeros in bit positions
8-31. In Java, the byte data type is a signed integer value, so the widening 
sign-extends the value. Without the & 0xff, values greater than 0x7f (127) would 
end up as negative int values. The rest is then fairly obvious: it adds 
0x100, which simply turns on the bit at index 8 (since it is guaranteed 
to be 0 in (bytes[i] & 0xff). It is then converted to a hex String value 
by the call to Integer.toString(..., 16).

2^8 = 16^2, 1 byte = 2 digits in hex ( 1 hex = 16 = 2^4 = 1/2 byte)
=> always represent digit 1 in the hundreds of 3 digit representation
of the hex=> substring to cut off this 1.

The reason for first adding 0x100 and then stripping off the 1 
(done by the substring(1) call, which takes the substring starting at 
position 1 through the end) is to guarantee two hex digits in the end 
result. Otherwise, byte values below 0x10(16) would end up as one-character 
strings when converted to hex. (b/c 0hex = hex)

It's debatable whether all that has better performance (it certainly isn't clearer) than:

sb.append(String.format("%02x", bytes[i])); //my method


	 */

}
