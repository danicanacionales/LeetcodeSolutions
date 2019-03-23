package string;

import java.util.HashSet;

public class UniqueEmailAddresses {
    /*
    Created by danicanacionales on 22/03/2019

    804. Unique Email Addresses

    If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.
    If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
    Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?

    Return the number of different transformations among all words we have.

    Example 1:
        Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
        Output: 2
    */

    public static void main(String[] args) {
        String [] emails = { "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com" };

//        String [] emails = { "+testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com" };
        System.out.println(new UniqueEmailAddresses().numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();
        for(String email : emails){
            int indexOfAtSign = email.indexOf('@');
            int indexOfPlusSign = email.indexOf('+');

            String localname = email.substring(0, indexOfAtSign);
            String domainname = email.substring(indexOfAtSign);

            if(indexOfPlusSign > -1)
                localname = localname.substring(0, indexOfPlusSign);
            localname = localname.replaceAll("\\.", "");

            uniqueEmails.add(localname.concat(domainname));
        }

        return uniqueEmails.size();
    }
}
