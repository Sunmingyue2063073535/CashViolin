import { registerPlugin } from '@capacitor/core';
export interface MyPlugin {
    echo(options: { key: string }): Promise<{ key: string }>;
}
const MyEcho = registerPlugin<MyPlugin>('MyEcho');
export default MyEcho;