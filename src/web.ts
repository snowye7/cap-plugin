import { WebPlugin } from '@capacitor/core';

import type { ExamplePlugin } from './definitions';

export class ExampleWeb extends WebPlugin implements ExamplePlugin {
  async sendLoginBroadcast() {}
  async sendLogOutBroadcast() {}
  async getRecord() {}
}
