package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Fabi S";
        } else if (query.contains("plus")){ // TODO extend the programm here
            String[] arr =  query.split(" ");
            return String.valueOf(Integer.parseInt(arr[3]) + Integer.parseInt(arr[5]));
        }
        else if (query.contains("largest")){
            String[] arr = query.substring(query.indexOf("largest")+8).split(", ");
            int max = 0;
            for(int i = 0; i<arr.length;i++){
                max = Math.max(max, Integer.parseInt(arr[i]));
            }
            return String.valueOf(max);
        }
        else{
            return "";
        }
    }
}
