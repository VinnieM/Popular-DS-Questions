package code.datastructures.arrays;

public class Urlify {

  public char[] urlify(char[] chars) {
    return String.valueOf(chars).replaceAll("\\s", "%20").toCharArray();
  }

  public char[] urlify(char[] chars, int trueLength) {
    int totalSpace = 0, index;
    for (int i = 0; i < trueLength; i++) {
      if (chars[i] == ' ') {
        ++totalSpace;
      }
    }
    index = trueLength + totalSpace * 2;
    for (int i = trueLength - 1; i >=0; i--) {
      if (chars[i] == ' ') {
        chars[--index] = '0';
        chars[--index] = '2';
        chars[--index] = '%';
      } else {
        chars[--index] = chars[i];
      }
    }
    return chars;
  }
}
