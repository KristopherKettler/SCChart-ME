package info.scce.cinco.product.scchart.events;

import com.google.common.base.Objects;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Action;
import info.scce.cinco.product.scchart.mglid.scchart.Declaration;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.ActionEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Action" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Action> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Action element)
 * - preMove(Action element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Action element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Action element, String attribute, Object oldValue)
 * - postCreate(Action element)
 * - postDelete(Action element)
 * - postDoubleClick(Action element)
 * - postMove(Action element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Action element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Action element)
 */
@SuppressWarnings("all")
public final class ActionEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.ActionEvent {
  @Override
  public void preCreate(final Class<? extends Action> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Action element) {
  }
  
  @Override
  public void preMove(final Action element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Action element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Action element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Action element) {
    element.setUuid(UUID.randomUUID().toString());
    boolean continue_ = false;
    EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
    boolean _tripleNotEquals = (_actions != null);
    if (_tripleNotEquals) {
      EList<Action> _actions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
      for (final Action action : _actions_1) {
        String _uuid = action.getUuid();
        String _uuid_1 = element.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
          }
          EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
          boolean _tripleNotEquals_2 = (_suspends != null);
          if (_tripleNotEquals_2) {
            int _declarationCount = declarationCount;
            int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          for (int i = 0; (i < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size()); i++) {
            {
              Action _get = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().get(i);
              _get.setX(10);
              Action _get_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().get(i);
              _get_1.setY(((30 + (13 * declarationCount)) + (13 * i)));
              Action _get_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().get(i);
              int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
              int _minus = (_width - 20);
              _get_2.setWidth(_minus);
              Action _get_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().get(i);
              _get_3.setHeight(13);
            }
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region : _regions_1) {
              int _y = region.getY();
              boolean _lessThan = (_y < (30 + (declarationCount * 13)));
              if (_lessThan) {
                EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                for (final Region region1 : _regions_2) {
                  int _y_1 = region1.getY();
                  int _plus = (_y_1 + 13);
                  region1.setY(_plus);
                }
                RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
                int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
                int _plus_1 = (_height + 13);
                _head.setHeight(_plus_1);
              }
            }
          }
          continue_ = true;
        }
      }
    }
    if ((!continue_)) {
      EList<Region> _regions_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      for (final Region region_1 : _regions_3) {
        EList<SuperState> _superStates = region_1.getSuperStates();
        boolean _tripleNotEquals_4 = (_superStates != null);
        if (_tripleNotEquals_4) {
          EList<SuperState> _superStates_1 = region_1.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            this.postCreateAction(superState, element);
          }
        }
      }
    }
  }
  
  public void postCreateAction(final SuperState superState, final Action action) {
    boolean continue_ = false;
    EList<Action> _actions = superState.getActions();
    boolean _tripleNotEquals = (_actions != null);
    if (_tripleNotEquals) {
      EList<Action> _actions_1 = superState.getActions();
      for (final Action actionList : _actions_1) {
        String _uuid = actionList.getUuid();
        String _uuid_1 = action.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = superState.getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = superState.getDeclarations().size();
          }
          EList<Suspend> _suspends = superState.getSuspends();
          boolean _tripleNotEquals_2 = (_suspends != null);
          if (_tripleNotEquals_2) {
            int _declarationCount = declarationCount;
            int _size = superState.getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          for (int i = 0; (i < superState.getActions().size()); i++) {
            {
              Action _get = superState.getActions().get(i);
              _get.setX(10);
              Action _get_1 = superState.getActions().get(i);
              _get_1.setY(((30 + (13 * declarationCount)) + (13 * i)));
              Action _get_2 = superState.getActions().get(i);
              int _width = superState.getWidth();
              int _minus = (_width - 20);
              _get_2.setWidth(_minus);
              Action _get_3 = superState.getActions().get(i);
              _get_3.setHeight(13);
            }
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = superState.getActions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = superState.getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = superState.getRegions();
            for (final Region region : _regions_1) {
              int _y = region.getY();
              boolean _lessThan = (_y < (30 + (declarationCount * 13)));
              if (_lessThan) {
                EList<Region> _regions_2 = superState.getRegions();
                for (final Region region1 : _regions_2) {
                  int _y_1 = region1.getY();
                  int _plus = (_y_1 + 13);
                  region1.setY(_plus);
                }
                int _height = superState.getHeight();
                int _plus_1 = (_height + 13);
                superState.setHeight(_plus_1);
              }
            }
          }
          continue_ = true;
        }
      }
    }
    if (((!continue_) && (superState.getRegions() != null))) {
      EList<Region> _regions_3 = superState.getRegions();
      for (final Region region_1 : _regions_3) {
        EList<SuperState> _superStates = region_1.getSuperStates();
        boolean _tripleNotEquals_4 = (_superStates != null);
        if (_tripleNotEquals_4) {
          EList<SuperState> _superStates_1 = region_1.getSuperStates();
          for (final SuperState superStateList : _superStates_1) {
            this.postCreateAction(superStateList, action);
          }
        }
      }
    }
  }
  
  @Override
  public Runnable postDelete(final Action element) {
    boolean continue_ = false;
    EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
    boolean _tripleNotEquals = (_actions != null);
    if (_tripleNotEquals) {
      for (int j = 0; (j < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size()); j++) {
        String _uuid = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().get(j).getUuid();
        String _uuid_1 = element.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
          }
          EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
          boolean _tripleNotEquals_2 = (_suspends != null);
          if (_tripleNotEquals_2) {
            int _declarationCount = declarationCount;
            int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          for (int i = j; (i < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size()); i++) {
            Action _get = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().get(i);
            int _y = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().get(i).getY();
            int _minus = (_y - 13);
            _get.setY(_minus);
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region : _regions_1) {
              int _y = region.getY();
              int _minus = (_y - 13);
              region.setY(_minus);
            }
          }
          continue_ = true;
          RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
          int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
          int _minus_1 = (_height - 13);
          _head.setHeight(_minus_1);
        }
      }
    }
    if ((!continue_)) {
      EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      for (final Region region : _regions) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals_1 = (_superStates != null);
        if (_tripleNotEquals_1) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            this.postDeleteAction(superState, element);
          }
        }
      }
    }
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  public void postDeleteAction(final SuperState superState, final Action action) {
    boolean continue_ = false;
    EList<Action> _actions = superState.getActions();
    boolean _tripleNotEquals = (_actions != null);
    if (_tripleNotEquals) {
      for (int j = 0; (j < superState.getActions().size()); j++) {
        String _uuid = superState.getActions().get(j).getUuid();
        String _uuid_1 = action.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<Declaration> _declarations = superState.getDeclarations();
          boolean _tripleNotEquals_1 = (_declarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = superState.getDeclarations().size();
          }
          EList<Suspend> _suspends = superState.getSuspends();
          boolean _tripleNotEquals_2 = (_suspends != null);
          if (_tripleNotEquals_2) {
            int _declarationCount = declarationCount;
            int _size = superState.getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          for (int i = j; (i < superState.getActions().size()); i++) {
            Action _get = superState.getActions().get(i);
            int _y = superState.getActions().get(i).getY();
            int _minus = (_y - 13);
            _get.setY(_minus);
          }
          int _declarationCount_1 = declarationCount;
          int _size_1 = superState.getActions().size();
          declarationCount = (_declarationCount_1 + _size_1);
          EList<Region> _regions = superState.getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = superState.getRegions();
            for (final Region region : _regions_1) {
              int _y = region.getY();
              int _minus = (_y - 13);
              region.setY(_minus);
            }
          }
          int _height = superState.getHeight();
          int _minus_1 = (_height - 13);
          superState.setHeight(_minus_1);
          continue_ = true;
        }
      }
    }
    if (((!continue_) && (superState.getRegions() != null))) {
      EList<Region> _regions = superState.getRegions();
      for (final Region region : _regions) {
        EList<SuperState> _superStates = region.getSuperStates();
        boolean _tripleNotEquals_1 = (_superStates != null);
        if (_tripleNotEquals_1) {
          EList<SuperState> _superStates_1 = region.getSuperStates();
          for (final SuperState superStateList : _superStates_1) {
            this.postDeleteAction(superStateList, action);
          }
        }
      }
    }
  }
  
  @Override
  public void postDoubleClick(final Action element) {
  }
  
  @Override
  public void postMove(final Action element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Action element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Action element) {
  }
}
