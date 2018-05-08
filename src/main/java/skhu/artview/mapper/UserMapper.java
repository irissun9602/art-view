package skhu.artview.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import skhu.artview.dto.User;

@Mapper
public interface UserMapper {
    User findOne(int id);
    List<User> findAll();
    void insert(User user);
    void update(User user);
    void delete(int id);
}
