package kr.co.clozet.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName:kr.co.clozet.common.dataStructure
 * fileName        :Box.java
 * author          : sungsuhan
 * date            :2022-05-12
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-12           sungsuhan      최초 생성
 **/
@Component @Data @Lazy
public class Box<T> {
    private ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void save(T t) {
        list.add(t);
    }
    public void update(int i, T t) {
        list.set(i, t);
    }
    public void delete(T t) {
        list.remove(t);
    }
    public List<T> findAll() {
        return list;
    }
    public T findById(int i) {
        return list.get(i);
    }
    public int count() {
        return list.size();
    }
    public void claer() {
        list.clear();
    }





}
