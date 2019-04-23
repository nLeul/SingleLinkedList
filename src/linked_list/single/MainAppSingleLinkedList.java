package linked_list.single;

import linked_list.List;

public class MainAppSingleLinkedList {

    public static void main(String[] args) {
        List<String> strList=new SingleLinkedList<String>();

        strList.getAll();

        strList.addBeginning("abel");
        strList.addBeginning("obama");
        strList.addBeginning("miller");

        System.out.println("the size :- "+strList.size());

        strList.getAll();

        strList.addLast("robert");
        strList.getAll();
        System.out.println("the size :- "+strList.size());

        //to check invalid index
        /*strList.addAtPosition(-1,"Richard");
        strList.getAll();
        System.out.println("the size :- "+strList.size());*/

        strList.addAtPosition(0,"Richard");
       // strList.getAll();
        //System.out.println("the size :- "+strList.size());

        strList.addAtPosition(5,"Rihanna");
      //  strList.getAll();
       // System.out.println("the size :- "+strList.size());

        //strList.addAtPosition(2,"Barack");
       // strList.getAll();
       // System.out.println("the size :- "+strList.size());

        //////////////////////////////////////////////////////////////////////////

        // to check all remove implementations

        /*strList.removeBeginning();strList.getAll();
        System.out.println("the size :- "+strList.size());

        strList.removeLast();strList.getAll();
        System.out.println("the size :- "+strList.size());

        strList.remove("robert");strList.getAll();
        System.out.println("the size :- "+strList.size());

        strList.remove("miller");strList.getAll();
        System.out.println("the size :- "+strList.size());

        strList.remove("obama");strList.getAll();
        System.out.println("the size :- "+strList.size());

        strList.remove("nobody");strList.getAll();
        System.out.println("the size :- "+strList.size());*/


        ////////////////////////////////////////////////////////////////////////////////

        //to check find and get implementations

        /*System.out.println(strList.get(-1));*/
       /* System.out.println(strList.get(0));
        System.out.println(strList.get(strList.size()-1));
        System.out.println(strList.get(strList.size()/2));
        System.out.println("the size :- "+strList.size());


        System.out.println(strList.find("error"));
        System.out.println(strList.find("Richard"));
        System.out.println(strList.find("Rihanna"));
        System.out.println(strList.find("obama"));

        System.out.println(strList.findIndex("error"));
        System.out.println(strList.findIndex("Richard"));
        System.out.println(strList.findIndex("Rihanna"));
        System.out.println(strList.findIndex("obama"));

        System.out.println("the size :- "+strList.size());
*/
//        strList.getAll();
//        System.out.println("middle data:- "+strList.middleNode());

        strList.getAll();
        strList.reverse();
        strList.getAll();



    }














}
