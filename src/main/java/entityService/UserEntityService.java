package entityService;

import dao.UserDao;
import dto.UserProductReviewDetailDto;

import java.util.List;

// This object service was created for the solution of problem 1.
public class UserEntityService {

    private UserDao userDao;

    public UserEntityService(){

        userDao = new UserDao();
    }

    public List<UserProductReviewDetailDto> findAllUserReviewById(Long id){
        return userDao.findAllUserReviewById(id);
    }
}
