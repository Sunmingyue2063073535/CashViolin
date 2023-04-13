import { add } from './AESKey';
import MyEcho from './Plugin.ts'
// // 获取Token
export async function getPhoneInfo() {
    const { gaId, androidId, appVersionName } = await MyEcho.echo({ key: 'getRequestHeadToken' });
    console.log(' GAID, AID, VERSION', gaId, androidId, appVersionName);
    const str = {
        GAID: gaId,
        AID: androidId,
        RV: appVersionName,
        VERSION: '1.0.0'
    }
    const token = 'UAM3IHKS' + add(str)
    return token
}