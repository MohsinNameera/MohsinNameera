/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> RestaurantList = new ArrayList<Restaurant>();
    
    public void addRestaurant(Restaurant restaurant){
        RestaurantList.add(restaurant);
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return RestaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> RestaurantList) {
        this.RestaurantList = RestaurantList;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        RestaurantList.remove(restaurant);
    }
    
}
