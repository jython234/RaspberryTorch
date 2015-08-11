package net.beaconpe.raspberrytorch.network.packet;

import net.beaconpe.raspberrytorch.io.RaspberryOutputStream;
import net.beaconpe.raspberrytorch.network.DataPacket;
import net.beaconpe.raspberrytorch.network.NetworkIds;

import java.io.IOException;

/**
 * LoginStatusPacket (0x83)
 *
 * @author jython234
 */
public class LoginStatusPacket extends DataPacket{
    public final static int STATUS_OK = 0;
    public final static int STATUS_SERVER_OUTDATED = 1;
    public final static int STATUS_CLIENT_OUTDATED = 2;

    public int status;

    @Override
    protected void _encode(RaspberryOutputStream out) throws IOException {
        out.writeInt(status);
    }

    @Override
    public byte getPID() {
        return NetworkIds.LOGIN_STATUS_PACKET;
    }

    @Override
    public int getLength() {
        return 5;
    }
}
