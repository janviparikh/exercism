class Pangrams {
  public static boolean isPangram(String string) {
    String[] alphabetArray = {"a","b","c","d","e","f","e","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String lowerString = string.toLowerCase();
    for(String alphabet: alphabetArray){
      if (!lowerString.contains(alphabet))
        return false;
    }
    return true;
  }
}
