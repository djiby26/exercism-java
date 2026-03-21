class SqueakyClean {
    static String clean(String identifier) {
        String cleaned = "";
        char[] toArr = identifier.toCharArray();
        for(int i = 0; i < toArr.length ; i++) {
            if(Character.isLetter(toArr[i]) || Character.isWhitespace(toArr[i]) || Character.isDigit(toArr[i])) {
                if(Character.isWhitespace(toArr[i])) {
                    cleaned += "_";
                }else if(i > 0 && toArr[i-1] == '-'){
                    cleaned += Character.toUpperCase(toArr[i]);
                }else{
                    cleaned += toArr[i];
                }
            }
        }
        cleaned = cleaned.replace('4','a');
        cleaned = cleaned.replace('3','e');
        cleaned = cleaned.replace('0','o');
        cleaned = cleaned.replace('1','l');
        cleaned = cleaned.replace('7','t');
        return cleaned;
    }
}
