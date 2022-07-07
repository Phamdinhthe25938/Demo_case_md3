package Service;

import Dao.UserDao;
import Modal.Account;

import java.util.List;

public class AccountService {

    static public UserDao userDao = new UserDao();

    static public List<Account> accounts = userDao.selectAllAccounts();

    public void addUser(Account account){
        accounts.add(account);
    }
    static public Account findAccount(int id){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getId()==id){
                return accounts.get(i);
            }
        }
        return null;
    }
}
