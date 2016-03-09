package com.eusia.autocomplete.Autocomplete;
import net.java.html.json.*;
public final class Item implements Cloneable {
  private static final Html4JavaType TYPE = new Html4JavaType();
  private final org.netbeans.html.json.spi.Proto proto;
  private int prop_id;
  public int getId() {
    proto.accessProperty("id");
    return prop_id;
  }
  public void setId(int v) {
    proto.verifyUnlocked();
    Object o = prop_id;
    if (TYPE.isSame(o , v)) return;
    prop_id = v;
    proto.valueHasMutated("id", o, v);
  }
  private java.lang.String prop_name;
  public java.lang.String getName() {
    proto.accessProperty("name");
    return prop_name;
  }
  public void setName(java.lang.String v) {
    proto.verifyUnlocked();
    Object o = prop_name;
    if (TYPE.isSame(o , v)) return;
    prop_name = v;
    proto.valueHasMutated("name", o, v);
  }
  private static Class<UIModel.ItemModel> modelFor() { return null; }
  private Item(net.java.html.BrwsrCtx context) {
    this.proto = TYPE.createProto(this, context);
  };
  public Item() {
    this(net.java.html.BrwsrCtx.findDefault(Item.class));
  };
  public Item(int aId, java.lang.String aName) {
    this(net.java.html.BrwsrCtx.findDefault(Item.class));
    this.prop_id = aId;
    this.prop_name = aName;
  };
  private static class Html4JavaType extends org.netbeans.html.json.spi.Proto.Type<Item> {
    private Html4JavaType() {
      super(Item.class, UIModel.ItemModel.class, 2, 1);
      registerProperty("id", 0, false);
      registerProperty("name", 1, false);
      registerFunction("selectItem", 0);
    }
    @Override public void setValue(Item data, int type, Object value) {
      switch (type) {
        case 0: data.setId(TYPE.extractValue(java.lang.Integer.class, value)); return;
        case 1: data.setName(TYPE.extractValue(java.lang.String.class, value)); return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public Object getValue(Item data, int type) {
      switch (type) {
        case 0: return data.getId();
        case 1: return data.getName();
      }
      throw new UnsupportedOperationException();
    }
    @Override public void call(Item model, int type, Object data, Object ev) throws Exception {
      switch (type) {
        case 0:
          com.eusia.autocomplete.Autocomplete.UIModel.ItemModel.selectItem(model);
          return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public org.netbeans.html.json.spi.Proto protoFor(Object obj) {
      return ((Item)obj).proto;    }
    @Override public void onChange(Item model, int type) {
      switch (type) {
    }
      throw new UnsupportedOperationException();
    }
  @Override public void onMessage(Item model, int index, int type, Object data, Object[] params) {
    switch (index) {
    }
    throw new UnsupportedOperationException("index: " + index + " type: " + type);
  }
    @Override public Item read(net.java.html.BrwsrCtx c, Object json) { return new Item(c, json); }
    @Override public Item cloneTo(Item o, net.java.html.BrwsrCtx c) { return o.clone(c); }
  }
  private Item(net.java.html.BrwsrCtx c, Object json) {
    this(c);
    Object[] ret = new Object[2];
    proto.extract(json, new String[] {
      "id",
      "name",
    }, ret);
    this.prop_id = ret[0] == null ? 0 : (TYPE.numberValue(ret[0])).intValue();
    this.prop_name = (java.lang.String)ret[1];
  }
  private static Object[] useAsArray(Object o) {
    return o instanceof Object[] ? ((Object[])o) : o == null ? new Object[0] : new Object[] { o };
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    sb.append('"').append("id").append('"').append(":");
    sb.append(TYPE.toJSON(prop_id));
    sb.append(',');
    sb.append('"').append("name").append('"').append(":");
    sb.append(TYPE.toJSON(prop_name));
    sb.append('}');
    return sb.toString();
  }
  public Item clone() {
    return clone(proto.getContext());
  }
  private Item clone(net.java.html.BrwsrCtx ctx) {
    Item ret = new Item(ctx);
    ret.prop_id = getId();
    ret.prop_name = getName();
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
  public Item applyBindings() {
    proto.applyBindings();
    return this;
  }
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Item)) return false;
    Item p = (Item)o;
    if (!TYPE.isSame(prop_id, p.prop_id)) return false;
    if (!TYPE.isSame(prop_name, p.prop_name)) return false;
    return true;
  }
  public int hashCode() {
    int h = Item.class.getName().hashCode();
    h = TYPE.hashPlus(prop_id, h);
    h = TYPE.hashPlus(prop_name, h);
    return h;
  }
}
