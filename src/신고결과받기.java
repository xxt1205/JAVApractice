//https://programmers.co.kr/learn/courses/30/lessons/92334
//신고 결과 받기

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
        Solution26 sc = new Solution26();
        String [] id_list = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        sc.solution(id_list,report,k);

    }
}



class Solution26 {
    public Object[] solution(String[] id_list, String[] report, int k) {

        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> id_listMap = new LinkedHashMap<>();
        for (String str : id_list) {

            id_listMap.put(str, 0);
            reportMap.put(str, new HashSet<>());

        }
        for (String str : report) {
            String[] user = str.split(" ");
            reportMap.get(user[1]).add(user[0]);
            System.out.println(reportMap);
        }
        for (String key : reportMap.keySet()) {
            System.out.println(key + ", " + reportMap.get(key));
            HashSet<String> set = reportMap.get(key);
            if (set.size() >= k) {

                for (String result : set) {

                    id_listMap.put(result, id_listMap.get(result) + 1);

                }
            }
        }
        Object[] answer = id_listMap.values().toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
//        Set<String> set = new HashSet<String>(Arrays.asList(report));
//
//        Iterator<String> iter = set.iterator();
//
//        System.out.println(set + "set");
//
//            while (iter.hasNext()) {
//                String result = iter.next();
//                int split = result.indexOf(" ");
//                String back = result.substring(split + 1);
//                String front = result.substring(0, split);
//
//                reportMap.replace(back, reportMap.get(back) + 1);
//
//                System.out.println(reportMap);
//                if (reportMap.get(back) >= k){
//                    System.out.println("추가");
//                    for (String key : id_listMap.keySet()) {
//                        if(front.equals(key))
//                        id_listMap.replace(front, id_listMap.get(front) + 1);
//                        System.out.println(id_listMap);
//                    }
//                }
//            }


//        for (String key : reportMap.keySet()){
//            if (reportMap.get(key) >= k){
//                iter = set.iterator();
//                while (iter.hasNext()) {
//                    String result = iter.next();
//                    int split = result.indexOf(" ");
//                    String back = result.substring(split + 1);
//                    String front = result.substring(0,split);
//                    if (back.equals(key)){
//                        id_listMap.replace(front,id_listMap.get(front)+1);
//                    }
//
//
//                }
//            }
//        }


//        for (int i = 0; i < id_list.length; i++){
//            answer[i] = id_listMap.get(id_list[i]);
//            System.out.println(answer[i]);
//        }


