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
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.DeclarationEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Declaration" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Declaration> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Declaration element)
 * - preMove(Declaration element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Declaration element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Declaration element, String attribute, Object oldValue)
 * - postCreate(Declaration element)
 * - postDelete(Declaration element)
 * - postDoubleClick(Declaration element)
 * - postMove(Declaration element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Declaration element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Declaration element)
 */
@SuppressWarnings("all")
public final class DeclarationEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.DeclarationEvent {
  @Override
  public void preCreate(final Class<? extends Declaration> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Declaration element) {
  }
  
  @Override
  public void preMove(final Declaration element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Declaration element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Declaration element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Declaration element) {
    element.setUuid(UUID.randomUUID().toString());
    boolean continue_ = false;
    EList<Declaration> _declarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
    boolean _tripleNotEquals = (_declarations != null);
    if (_tripleNotEquals) {
      EList<Declaration> _declarations_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
      for (final Declaration declaration : _declarations_1) {
        String _uuid = declaration.getUuid();
        String _uuid_1 = element.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          declarationCount = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
          for (int i = 0; (i < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size()); i++) {
            {
              Declaration _get = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().get(i);
              _get.setX(10);
              Declaration _get_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().get(i);
              _get_1.setY((30 + (13 * i)));
              Declaration _get_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().get(i);
              int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
              int _minus = (_width - 20);
              _get_2.setWidth(_minus);
              Declaration _get_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().get(i);
              _get_3.setHeight(13);
            }
          }
          EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
          boolean _tripleNotEquals_1 = (_suspends != null);
          if (_tripleNotEquals_1) {
            EList<Suspend> _suspends_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
            for (final Suspend suspend : _suspends_1) {
              int _y = suspend.getY();
              int _plus = (_y + 13);
              suspend.setY(_plus);
            }
            int _declarationCount = declarationCount;
            int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
            for (final Action action : _actions_1) {
              int _y_1 = action.getY();
              int _plus_1 = (_y_1 + 13);
              action.setY(_plus_1);
            }
            int _declarationCount_1 = declarationCount;
            int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
            declarationCount = (_declarationCount_1 + _size_1);
          }
          EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region : _regions_1) {
              int _y_2 = region.getY();
              boolean _lessThan = (_y_2 < (30 + (declarationCount * 13)));
              if (_lessThan) {
                EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
                for (final Region region1 : _regions_2) {
                  int _y_3 = region1.getY();
                  int _plus_2 = (_y_3 + 13);
                  region1.setY(_plus_2);
                }
                RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
                int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
                int _plus_3 = (_height + 13);
                _head.setHeight(_plus_3);
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
            this.postCreateDeclaration(superState, element);
          }
        }
      }
    }
  }
  
  public void postCreateDeclaration(final SuperState superState, final Declaration declaration) {
    boolean continue_ = false;
    EList<Declaration> _declarations = superState.getDeclarations();
    boolean _tripleNotEquals = (_declarations != null);
    if (_tripleNotEquals) {
      EList<Declaration> _declarations_1 = superState.getDeclarations();
      for (final Declaration declarartionList : _declarations_1) {
        String _uuid = declarartionList.getUuid();
        String _uuid_1 = declaration.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          declarationCount = superState.getDeclarations().size();
          for (int i = 0; (i < superState.getDeclarations().size()); i++) {
            {
              Declaration _get = superState.getDeclarations().get(i);
              _get.setX(10);
              Declaration _get_1 = superState.getDeclarations().get(i);
              _get_1.setY((30 + (13 * i)));
              Declaration _get_2 = superState.getDeclarations().get(i);
              int _width = superState.getWidth();
              int _minus = (_width - 20);
              _get_2.setWidth(_minus);
              Declaration _get_3 = superState.getDeclarations().get(i);
              _get_3.setHeight(13);
            }
          }
          EList<Suspend> _suspends = superState.getSuspends();
          boolean _tripleNotEquals_1 = (_suspends != null);
          if (_tripleNotEquals_1) {
            EList<Suspend> _suspends_1 = superState.getSuspends();
            for (final Suspend suspend : _suspends_1) {
              int _y = suspend.getY();
              int _plus = (_y + 13);
              suspend.setY(_plus);
            }
            int _declarationCount = declarationCount;
            int _size = superState.getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          EList<Action> _actions = superState.getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = superState.getActions();
            for (final Action action : _actions_1) {
              int _y_1 = action.getY();
              int _plus_1 = (_y_1 + 13);
              action.setY(_plus_1);
            }
            int _declarationCount_1 = declarationCount;
            int _size_1 = superState.getActions().size();
            declarationCount = (_declarationCount_1 + _size_1);
          }
          EList<Region> _regions = superState.getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = superState.getRegions();
            for (final Region region : _regions_1) {
              int _y_2 = region.getY();
              boolean _lessThan = (_y_2 < (30 + (declarationCount * 13)));
              if (_lessThan) {
                EList<Region> _regions_2 = superState.getRegions();
                for (final Region region1 : _regions_2) {
                  int _y_3 = region1.getY();
                  int _plus_2 = (_y_3 + 13);
                  region1.setY(_plus_2);
                }
                int _height = superState.getHeight();
                int _plus_3 = (_height + 13);
                superState.setHeight(_plus_3);
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
            this.postCreateDeclaration(superStateList, declaration);
          }
        }
      }
    }
  }
  
  @Override
  public Runnable postDelete(final Declaration element) {
    element.setUuid(UUID.randomUUID().toString());
    boolean continue_ = false;
    EList<Declaration> _declarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations();
    boolean _tripleNotEquals = (_declarations != null);
    if (_tripleNotEquals) {
      for (int j = 0; (j < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size()); j++) {
        String _uuid = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().get(j).getUuid();
        String _uuid_1 = element.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          declarationCount = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size();
          for (int i = j; (i < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().size()); i++) {
            Declaration _get = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().get(i);
            int _y = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getDeclarations().get(i).getY();
            int _minus = (_y - 13);
            _get.setY(_minus);
          }
          EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
          boolean _tripleNotEquals_1 = (_suspends != null);
          if (_tripleNotEquals_1) {
            EList<Suspend> _suspends_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
            for (final Suspend suspend : _suspends_1) {
              int _y = suspend.getY();
              int _minus = (_y - 13);
              suspend.setY(_minus);
            }
            int _declarationCount = declarationCount;
            int _size = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          EList<Action> _actions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions();
            for (final Action action : _actions_1) {
              int _y_1 = action.getY();
              int _minus_1 = (_y_1 - 13);
              action.setY(_minus_1);
            }
            int _declarationCount_1 = declarationCount;
            int _size_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getActions().size();
            declarationCount = (_declarationCount_1 + _size_1);
          }
          EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
            for (final Region region : _regions_1) {
              int _y_2 = region.getY();
              int _minus_2 = (_y_2 - 13);
              region.setY(_minus_2);
            }
          }
          RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
          int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
          int _minus_3 = (_height - 13);
          _head.setHeight(_minus_3);
          continue_ = true;
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
            this.postDeleteDeclaration(superState, element);
          }
        }
      }
    }
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  public void postDeleteDeclaration(final SuperState superState, final Declaration declaration) {
    boolean continue_ = false;
    EList<Declaration> _declarations = superState.getDeclarations();
    boolean _tripleNotEquals = (_declarations != null);
    if (_tripleNotEquals) {
      for (int j = 0; (j < superState.getDeclarations().size()); j++) {
        String _uuid = superState.getDeclarations().get(j).getUuid();
        String _uuid_1 = declaration.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          declarationCount = superState.getDeclarations().size();
          for (int i = j; (i < superState.getDeclarations().size()); i++) {
            Declaration _get = superState.getDeclarations().get(i);
            int _y = superState.getDeclarations().get(i).getY();
            int _minus = (_y - 13);
            _get.setY(_minus);
          }
          EList<Suspend> _suspends = superState.getSuspends();
          boolean _tripleNotEquals_1 = (_suspends != null);
          if (_tripleNotEquals_1) {
            EList<Suspend> _suspends_1 = superState.getSuspends();
            for (final Suspend suspend : _suspends_1) {
              int _y = suspend.getY();
              int _minus = (_y - 13);
              suspend.setY(_minus);
            }
            int _declarationCount = declarationCount;
            int _size = superState.getSuspends().size();
            declarationCount = (_declarationCount + _size);
          }
          EList<Action> _actions = superState.getActions();
          boolean _tripleNotEquals_2 = (_actions != null);
          if (_tripleNotEquals_2) {
            EList<Action> _actions_1 = superState.getActions();
            for (final Action action : _actions_1) {
              int _y_1 = action.getY();
              int _minus_1 = (_y_1 - 13);
              action.setY(_minus_1);
            }
            int _declarationCount_1 = declarationCount;
            int _size_1 = superState.getActions().size();
            declarationCount = (_declarationCount_1 + _size_1);
          }
          EList<Region> _regions = superState.getRegions();
          boolean _tripleNotEquals_3 = (_regions != null);
          if (_tripleNotEquals_3) {
            EList<Region> _regions_1 = superState.getRegions();
            for (final Region region : _regions_1) {
              int _y_2 = region.getY();
              int _minus_2 = (_y_2 - 13);
              region.setY(_minus_2);
            }
          }
          int _height = superState.getHeight();
          int _minus_3 = (_height - 13);
          superState.setHeight(_minus_3);
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
            this.postDeleteDeclaration(superStateList, declaration);
          }
        }
      }
    }
  }
  
  @Override
  public void postDoubleClick(final Declaration element) {
  }
  
  @Override
  public void postMove(final Declaration element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Declaration element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Declaration element) {
  }
}
