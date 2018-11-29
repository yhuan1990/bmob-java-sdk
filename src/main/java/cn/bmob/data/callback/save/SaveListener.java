package cn.bmob.data.callback.save;

public abstract class SaveListener extends BmobSaveCallback{


    /**
     * 保存成功，返回保存对象的唯一标志和保存时间
     * @param objectId
     * @param createdAt
     */
    public abstract void onSuccess(String objectId,String createdAt);


}
