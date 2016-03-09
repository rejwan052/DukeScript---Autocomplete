package com.eusia.autocomplete.Autocomplete;
import net.java.html.json.*;
public final class UI implements Cloneable {
  private static final Html4JavaType TYPE = new Html4JavaType();
  private final org.netbeans.html.json.spi.Proto proto;
  private java.lang.String prop_keyword;
  public java.lang.String getKeyword() {
    proto.accessProperty("keyword");
    return prop_keyword;
  }
  public void setKeyword(java.lang.String v) {
    proto.verifyUnlocked();
    Object o = prop_keyword;
    if (TYPE.isSame(o , v)) return;
    prop_keyword = v;
    proto.valueHasMutated("keyword", o, v);
UI model = UI.this;
    UIModel.checkKeyword(model);
  }
  private final java.util.List<Item> prop_items;
  public java.util.List<Item> getItems() {
    proto.accessProperty("items");
    return prop_items;
  }
  private final java.util.List<Item> prop_selecteditems;
  public java.util.List<Item> getSelecteditems() {
    proto.accessProperty("selecteditems");
    return prop_selecteditems;
  }
  private java.lang.String prop_displayclass;
  public java.lang.String getDisplayclass() {
    proto.accessProperty("displayclass");
    return prop_displayclass;
  }
  public void setDisplayclass(java.lang.String v) {
    proto.verifyUnlocked();
    Object o = prop_displayclass;
    if (TYPE.isSame(o , v)) return;
    prop_displayclass = v;
    proto.valueHasMutated("displayclass", o, v);
  }
  private static Class<UIModel> modelFor() { return null; }
  private UI(net.java.html.BrwsrCtx context) {
    this.proto = TYPE.createProto(this, context);
    this.prop_items = proto.createList("items", -1);
    this.prop_selecteditems = proto.createList("selecteditems", -1);
  };
  public UI() {
    this(net.java.html.BrwsrCtx.findDefault(UI.class));
  };
  public UI(java.lang.String aKeyword, java.lang.String aDisplayclass, Item... aItems) {
    this(net.java.html.BrwsrCtx.findDefault(UI.class));
    this.prop_keyword = aKeyword;
    this.prop_displayclass = aDisplayclass;
    proto.initTo(this.prop_items, aItems);
  };
  private static class Html4JavaType extends org.netbeans.html.json.spi.Proto.Type<UI> {
    private Html4JavaType() {
      super(UI.class, UIModel.class, 4, 0);
      registerProperty("keyword", 0, false);
      registerProperty("items", 1, false);
      registerProperty("selecteditems", 2, false);
      registerProperty("displayclass", 3, false);
    }
    @Override public void setValue(UI data, int type, Object value) {
      switch (type) {
        case 0: data.setKeyword(TYPE.extractValue(java.lang.String.class, value)); return;
        case 1: TYPE.replaceValue(data.getItems(), Item.class, value); return;
        case 2: TYPE.replaceValue(data.getSelecteditems(), Item.class, value); return;
        case 3: data.setDisplayclass(TYPE.extractValue(java.lang.String.class, value)); return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public Object getValue(UI data, int type) {
      switch (type) {
        case 0: return data.getKeyword();
        case 1: return data.getItems();
        case 2: return data.getSelecteditems();
        case 3: return data.getDisplayclass();
      }
      throw new UnsupportedOperationException();
    }
    @Override public void call(UI model, int type, Object data, Object ev) throws Exception {
      switch (type) {
      }
      throw new UnsupportedOperationException();
    }
    @Override public org.netbeans.html.json.spi.Proto protoFor(Object obj) {
      return ((UI)obj).proto;    }
    @Override public void onChange(UI model, int type) {
      switch (type) {
      case 0:
        UIModel.checkKeyword(model);

      return;
    }
      throw new UnsupportedOperationException();
    }
  @Override public void onMessage(UI model, int index, int type, Object data, Object[] params) {
    switch (index) {
    }
    throw new UnsupportedOperationException("index: " + index + " type: " + type);
  }
    @Override public UI read(net.java.html.BrwsrCtx c, Object json) { return new UI(c, json); }
    @Override public UI cloneTo(UI o, net.java.html.BrwsrCtx c) { return o.clone(c); }
  }
  private UI(net.java.html.BrwsrCtx c, Object json) {
    this(c);
    Object[] ret = new Object[4];
    proto.extract(json, new String[] {
      "keyword",
      "items",
      "selecteditems",
      "displayclass",
    }, ret);
    this.prop_keyword = (java.lang.String)ret[0];
    for (Object e : useAsArray(ret[1])) {
      this.prop_items.add(proto.read(Item.class, e));
    }
    for (Object e : useAsArray(ret[2])) {
      this.prop_selecteditems.add(proto.read(Item.class, e));
    }
    this.prop_displayclass = (java.lang.String)ret[3];
  }
  private static Object[] useAsArray(Object o) {
    return o instanceof Object[] ? ((Object[])o) : o == null ? new Object[0] : new Object[] { o };
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    sb.append('"').append("keyword").append('"').append(":");
    sb.append(TYPE.toJSON(prop_keyword));
    sb.append(',');
    sb.append('"').append("items").append('"').append(":");
    sb.append(TYPE.toJSON(prop_items));
    sb.append(',');
    sb.append('"').append("selecteditems").append('"').append(":");
    sb.append(TYPE.toJSON(prop_selecteditems));
    sb.append(',');
    sb.append('"').append("displayclass").append('"').append(":");
    sb.append(TYPE.toJSON(prop_displayclass));
    sb.append('}');
    return sb.toString();
  }
  public UI clone() {
    return clone(proto.getContext());
  }
  private UI clone(net.java.html.BrwsrCtx ctx) {
    UI ret = new UI(ctx);
    ret.prop_keyword = getKeyword();
    proto.cloneList(ret.getItems(), ctx, prop_items);
    proto.cloneList(ret.getSelecteditems(), ctx, prop_selecteditems);
    ret.prop_displayclass = getDisplayclass();
    return ret;
  }
  /** Activates this model instance in the current {@link 
net.java.html.json.Models#bind(java.lang.Object, net.java.html.BrwsrCtx) browser context}. 
In case of using Knockout technology, this means to 
bind JSON like data in this model instance with Knockout tags in 
the surrounding HTML page.
This method binds to element '""' on the page
@return <code>this</code> object
*/
  public UI applyBindings() {
    proto.applyBindings();
    return this;
  }
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof UI)) return false;
    UI p = (UI)o;
    if (!TYPE.isSame(prop_keyword, p.prop_keyword)) return false;
    if (!TYPE.isSame(prop_items, p.prop_items)) return false;
    if (!TYPE.isSame(prop_selecteditems, p.prop_selecteditems)) return false;
    if (!TYPE.isSame(prop_displayclass, p.prop_displayclass)) return false;
    return true;
  }
  public int hashCode() {
    int h = UI.class.getName().hashCode();
    h = TYPE.hashPlus(prop_keyword, h);
    h = TYPE.hashPlus(prop_items, h);
    h = TYPE.hashPlus(prop_selecteditems, h);
    h = TYPE.hashPlus(prop_displayclass, h);
    return h;
  }
}
