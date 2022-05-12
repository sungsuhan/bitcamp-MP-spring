package kr.co.clozet.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * packageName:kr.co.clozet.common.dataStructure
 * fileName        :Trunk.java
 * author          : sungsuhan
 * date            :2022-05-12
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-12           sungsuhan      최초 생성
 **/
@Component @Lazy @Data
public class Trunk<K, V> {
    public HashMap<K, V> map;

    public Trunk() {
        this.map = new HashMap<>();
    }

    public void save(K k, V v) {
        map.put(k, v);
    }
    public void update(K k, V v) {
        map.replace(k, v);
    }
    public void delete(K k, V v) {
        map.remove(k);
    }
    public V findById(K k) {
        return map.get(k);
    }
    public List<K> findByName(K k) {
        return (List<K>) map.get(k);
    }
    public List<K> findAll() {
        return (List<K>) map.values();
    }
    public int count() {
        return map.size();
    }
    public boolean existById(K k) {
        return map.containsKey(k);
    }
    public void clear() {
        map.clear();
    }






}
