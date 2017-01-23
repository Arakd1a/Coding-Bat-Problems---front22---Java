public String front22(String str) {
  if(str.length()>2){
    char char1 = str.charAt(0);
    char char2 = str.charAt(1);
    String str1 = Character.toString(char1);
    String str2 = Character.toString(char2);
    return str1 + str2 + str +str1 + str2;
  }
    return str+str+str;
}
