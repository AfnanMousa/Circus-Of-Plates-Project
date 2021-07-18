package controller.state;

import java.util.List;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.util.LinkedList;
import java.util.List;
import eg.edu.alexu.csd.oop.game.GameObject;
import controller.state.IState;
import controller.strategy.Factory;
import controller.strategy.Strategy;
import model.pool.ConnectionPool;
import model.Memento.*;
import controller.state.*;
import model.*;

public interface IState {
   public boolean checkState(List<GameObject> constant, List<GameObject> moving, List<GameObject> control,GameObject m ,List<Plate> r, List<Plate> l,Strategy level,boolean timeout);
   public boolean State(IState state, List<GameObject> constant, List<GameObject> moving, List<GameObject> control,GameObject m,List<Plate> r, List<Plate> l,Strategy level,boolean timeout);
}
