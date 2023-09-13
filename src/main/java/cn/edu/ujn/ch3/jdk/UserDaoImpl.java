package cn.edu.ujn.ch3.jdk;

public class UserDaoImpl implements IUserDao{
@Override
    public void addUser() {
        System.out.println("Add a user");
    }

    @Override
    public void deleteUser() {
        System.out.println("Delete a user");
    }

}
