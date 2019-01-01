package demo;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 命令DTO类
 * Created by wuzhaofeng on 17/7/23.
 */

@Setter
@Getter
@ToString(callSuper=true)
public class DeviceCommand {

    private String id;

    private String status;
}
