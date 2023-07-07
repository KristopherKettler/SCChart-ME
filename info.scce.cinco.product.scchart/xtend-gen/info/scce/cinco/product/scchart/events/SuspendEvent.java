package info.scce.cinco.product.scchart.events;

import com.google.common.base.Objects;
import graphmodel.Direction;
import graphmodel.ModelElementContainer;
import info.scce.cinco.product.scchart.mglid.scchart.Region;
import info.scce.cinco.product.scchart.mglid.scchart.RootState;
import info.scce.cinco.product.scchart.mglid.scchart.RootStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.SuperState;
import info.scce.cinco.product.scchart.mglid.scchart.SuperStateDeclaration;
import info.scce.cinco.product.scchart.mglid.scchart.Suspend;
import java.util.UUID;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * About this class:
 * - This is a default implementation for info.scce.cinco.product.scchart.mglid.scchart.event.SuspendEvent.
 * - This class was generated, because you added an "@event" annotation to
 *   Node "Suspend" in "SCChart.mgl".
 * - This file will not be overwritten on future generation processes.
 * 
 * Available event methods:
 * - preCreate(Class<? extends Suspend> elementClass, ModelElementContainer container, int x, int y, int width, int height)
 * - preDelete(Suspend element)
 * - preMove(Suspend element, ModelElementContainer newContainer, int newX, int newY)
 * - preResize(Suspend element, int newWidth, int newHeight, int newX, int newY, Direction direction)
 * - postAttributeChange(Suspend element, String attribute, Object oldValue)
 * - postCreate(Suspend element)
 * - postDelete(Suspend element)
 * - postDoubleClick(Suspend element)
 * - postMove(Suspend element, ModelElementContainer oldContainer, int oldX, int oldY)
 * - postResize(Suspend element, int oldWidth, int oldHeight, int oldX, int oldY, Direction direction)
 * - postSelect(Suspend element)
 */
@SuppressWarnings("all")
public final class SuspendEvent extends info.scce.cinco.product.scchart.mglid.scchart.event.SuspendEvent {
  @Override
  public void preCreate(final Class<? extends Suspend> elementClass, final ModelElementContainer container, final int x, final int y, final int width, final int height) {
  }
  
  @Override
  public void preDelete(final Suspend element) {
  }
  
  @Override
  public void preMove(final Suspend element, final ModelElementContainer newContainer, final int newX, final int newY) {
  }
  
  @Override
  public void preResize(final Suspend element, final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
  }
  
  @Override
  public void postAttributeChange(final Suspend element, final String attribute, final Object oldValue) {
  }
  
  @Override
  public void postCreate(final Suspend element) {
    element.setUuid(UUID.randomUUID().toString());
    boolean break_ = false;
    EList<Suspend> _suspends = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends();
    for (final Suspend suspend : _suspends) {
      String _uuid = suspend.getUuid();
      String _uuid_1 = element.getUuid();
      boolean _equals = Objects.equal(_uuid, _uuid_1);
      if (_equals) {
        int declarationCount = 0;
        EList<RootStateDeclaration> _rootStateDeclarations = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations();
        boolean _tripleNotEquals = (_rootStateDeclarations != null);
        if (_tripleNotEquals) {
          declarationCount = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRootStateDeclarations().size();
        }
        for (int i = 0; (i < IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().size()); i++) {
          {
            Suspend _get = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().get(i);
            _get.setX(10);
            Suspend _get_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().get(i);
            _get_1.setY(((30 + (13 * declarationCount)) + (13 * i)));
            Suspend _get_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().get(i);
            int _width = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getWidth();
            int _minus = (_width - 20);
            _get_2.setWidth(_minus);
            Suspend _get_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends().get(i);
            _get_3.setHeight(13);
          }
        }
        EList<Region> _regions = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
        boolean _tripleNotEquals_1 = (_regions != null);
        if (_tripleNotEquals_1) {
          EList<Region> _regions_1 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
          for (final Region region : _regions_1) {
            int _y = region.getY();
            int _y_1 = IterableExtensions.<Suspend>last(IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getSuspends()).getY();
            int _plus = (_y_1 + 13);
            boolean _lessThan = (_y < _plus);
            if (_lessThan) {
              EList<Region> _regions_2 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
              for (final Region region1 : _regions_2) {
                int _y_2 = region1.getY();
                int _plus_1 = (_y_2 + 13);
                region1.setY(_plus_1);
              }
              RootState _head = IterableExtensions.<RootState>head(element.getRootElement().getRootStates());
              int _height = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getHeight();
              int _plus_2 = (_height + 13);
              _head.setHeight(_plus_2);
            }
          }
        }
        break_ = true;
      }
    }
    if ((!break_)) {
      EList<Region> _regions_3 = IterableExtensions.<RootState>head(element.getRootElement().getRootStates()).getRegions();
      for (final Region region_1 : _regions_3) {
        EList<SuperState> _superStates = region_1.getSuperStates();
        boolean _tripleNotEquals_2 = (_superStates != null);
        if (_tripleNotEquals_2) {
          EList<SuperState> _superStates_1 = region_1.getSuperStates();
          for (final SuperState superState : _superStates_1) {
            this.postCreateSuspend(superState, element);
          }
        }
      }
    }
  }
  
  public void postCreateSuspend(final SuperState superState, final Suspend suspend) {
    boolean break_ = false;
    EList<Suspend> _suspends = superState.getSuspends();
    boolean _tripleNotEquals = (_suspends != null);
    if (_tripleNotEquals) {
      EList<Suspend> _suspends_1 = superState.getSuspends();
      for (final Suspend suspendList : _suspends_1) {
        String _uuid = suspendList.getUuid();
        String _uuid_1 = suspend.getUuid();
        boolean _equals = Objects.equal(_uuid, _uuid_1);
        if (_equals) {
          int declarationCount = 0;
          EList<SuperStateDeclaration> _superStateDeclarations = superState.getSuperStateDeclarations();
          boolean _tripleNotEquals_1 = (_superStateDeclarations != null);
          if (_tripleNotEquals_1) {
            declarationCount = superState.getSuperStateDeclarations().size();
          }
          for (int i = 0; (i < superState.getSuspends().size()); i++) {
            {
              Suspend _get = superState.getSuspends().get(i);
              _get.setX(10);
              Suspend _get_1 = superState.getSuspends().get(i);
              _get_1.setY(((30 + (13 * declarationCount)) + (13 * i)));
              Suspend _get_2 = superState.getSuspends().get(i);
              int _width = superState.getWidth();
              int _minus = (_width - 20);
              _get_2.setWidth(_minus);
              Suspend _get_3 = superState.getSuspends().get(i);
              _get_3.setHeight(13);
            }
          }
          EList<Region> _regions = superState.getRegions();
          boolean _tripleNotEquals_2 = (_regions != null);
          if (_tripleNotEquals_2) {
            EList<Region> _regions_1 = superState.getRegions();
            for (final Region region : _regions_1) {
              int _y = region.getY();
              int _y_1 = IterableExtensions.<Suspend>last(superState.getSuspends()).getY();
              int _plus = (_y_1 + 13);
              boolean _lessThan = (_y < _plus);
              if (_lessThan) {
                EList<Region> _regions_2 = superState.getRegions();
                for (final Region region1 : _regions_2) {
                  int _y_2 = region1.getY();
                  int _plus_1 = (_y_2 + 13);
                  region1.setY(_plus_1);
                }
                int _height = superState.getHeight();
                int _plus_2 = (_height + 13);
                superState.setHeight(_plus_2);
              }
            }
          }
          break_ = true;
        }
      }
    }
    if (((!break_) && (superState.getRegions() != null))) {
      EList<Region> _regions_3 = superState.getRegions();
      for (final Region region_1 : _regions_3) {
        EList<SuperState> _superStates = region_1.getSuperStates();
        boolean _tripleNotEquals_3 = (_superStates != null);
        if (_tripleNotEquals_3) {
          EList<SuperState> _superStates_1 = region_1.getSuperStates();
          for (final SuperState superStateList : _superStates_1) {
            this.postCreateSuspend(superStateList, suspend);
          }
        }
      }
    }
  }
  
  @Override
  public Runnable postDelete(final Suspend element) {
    final Runnable _function = () -> {
    };
    return _function;
  }
  
  @Override
  public void postDoubleClick(final Suspend element) {
  }
  
  @Override
  public void postMove(final Suspend element, final ModelElementContainer oldContainer, final int oldX, final int oldY) {
  }
  
  @Override
  public void postResize(final Suspend element, final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
  }
  
  @Override
  public void postSelect(final Suspend element) {
  }
}
