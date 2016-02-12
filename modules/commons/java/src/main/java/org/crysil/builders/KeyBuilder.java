package org.crysil.builders;

import org.crysil.protocol.payload.crypto.key.InternalCertificate;
import org.crysil.protocol.payload.crypto.key.KeyHandle;

public class KeyBuilder {

	public static KeyHandle buildKeyHandle(String id, String subId) {
		KeyHandle tmp = new KeyHandle();
		tmp.setId(id);
		tmp.setSubId(subId);
		return tmp;
	}

	public static InternalCertificate buildInternalCertificate(String id, String subId, String encodedCertificate) {
		InternalCertificate tmp = new InternalCertificate();
		tmp.setId(id);
		tmp.setSubId(subId);
		tmp.setEncodedCertificate(encodedCertificate);
		return tmp;
	}

}